package com.mp.service.impl;

import com.mp.common.Const;
import com.mp.common.ServerResponse;
import com.mp.dao.CategoryMapper;
import com.mp.entity.Category;
import com.mp.service.CategoryService;
import com.mp.vo.CategoryTreeVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 添加分类
     * @param category
     * @return
     */
    public ServerResponse<String> addCategory(Category category) {
        if(StringUtils.isBlank(category.getName())) {
            return ServerResponse.createByErrorMessage("分类名称不能为空");
        }
        Category newCategory = new Category();
        newCategory.setName(category.getName());
        newCategory.setCreateTime(new Date());
        newCategory.setParentId(category.getParentId());
        newCategory.setStatus(category.getStatus());

        int resultCount = categoryMapper.insertSelective(newCategory);
        if(resultCount == 0) {
            return ServerResponse.createByErrorMessage("添加分类失败");
        }
        return ServerResponse.createBySuccessMessage("添加分类成功");
    }

    /**
     * 修改分类信息 排序 假删除
     * @param category
     * @return
     */
    @Transactional
    public ServerResponse<String> updateCategory(Category category) {
        if(category.getId() == null) {
            return ServerResponse.createByErrorMessage("分类id不能为空");
        }
        category.setCreateTime(null);
        category.setUpdateTime(new Date());
        int resultCount = categoryMapper.updateByPrimaryKeySelective(category);
        String operateText = "修改";
        if(category.getStatus() == Const.CategoryStatus.CATEGORY_DELETE) {
            operateText = "删除";
            //TODO 本分类下的文章一起 假删除
        }
        if(resultCount == 0) {
            return ServerResponse.createByErrorMessage(operateText + "失败");
        }
        return ServerResponse.createBySuccessMessage(operateText + "成功");
    }

    /**
     * 真实删除
     * @param id
     * @return
     */
    @Transactional
    public ServerResponse<String> deleteCategory(Integer id) {
        if(id == null) {
            return ServerResponse.createByErrorMessage("分类id不能为空");
        }
        int resultCount = categoryMapper.deleteByPrimaryKey(id);
        if(resultCount == 0) {
            return ServerResponse.createByErrorMessage("删除分类失败");
        }
        //TODO 本分类下的文章一起删除

        return ServerResponse.createBySuccessMessage("删除成功");
    }

    /**
     * 获取分类列表
     * @return
     */
    public ServerResponse<List<CategoryTreeVo>> selectCategoryList() {
        List<Category> categoryList = categoryMapper.selectCategory();
        List<CategoryTreeVo> categoryTreeVoList = buildByRecursive(categoryList);
        return ServerResponse.createBySuccess(categoryTreeVoList);
    }

    /**
     * 获取分类详情
     * @param id
     * @return
     */
    @Override
    public ServerResponse<Category> selectCategory(Integer id) {
        if(id == null) {
            return ServerResponse.createByErrorMessage("id不能为空");
        }
        Category category = categoryMapper.selectByPrimaryKey(id);
        return ServerResponse.createBySuccess(category);
    }

    /**
     *  使用递归方法建树
     * @param categoryList
     * @return
     */
    public List<CategoryTreeVo> buildByRecursive(List<Category> categoryList) {
        List<CategoryTreeVo> trees = new ArrayList<CategoryTreeVo>();
        for (Category category: categoryList) {
            if(category.getParentId() == 0) {
                CategoryTreeVo parentCategory = setCategoryTreeVo(category);
                trees.add(findChildren(parentCategory, categoryList));
            }
        }
        return trees;
    }

    /**
     * 递归查找子节点
     * @param categoryTreeVo
     * @param categoryList
     * @return
     */
    public static CategoryTreeVo findChildren(CategoryTreeVo categoryTreeVo, List<Category> categoryList){
        for (Category c: categoryList) {
            if(categoryTreeVo.getId().equals(c.getParentId())) {
                CategoryTreeVo children = setCategoryTreeVo(c);
                if(categoryTreeVo.getChildren() == null) {
                    categoryTreeVo.setChildren(new ArrayList<CategoryTreeVo>());
                }
                categoryTreeVo.getChildren().add(findChildren(children, categoryList));
            }
        }
        return categoryTreeVo;
    }

    /**
     * 设置分类树的值
     * @param category
     * @return
     */
    private static CategoryTreeVo setCategoryTreeVo(Category category) {
        CategoryTreeVo parentCategory = new CategoryTreeVo();
        parentCategory.setId(category.getId());
        parentCategory.setName(category.getName());
        parentCategory.setParentId(category.getParentId());
        parentCategory.setStatus(category.getStatus());
        parentCategory.setSort(category.getSort());
        parentCategory.setCreateTime(category.getCreateTime());
        parentCategory.setUpdateTime(category.getUpdateTime());
        return parentCategory;
    }
}
