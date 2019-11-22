package com.mp.service.impl;

import com.mp.common.Const;
import com.mp.common.ServerResponse;
import com.mp.dao.CategoryMapper;
import com.mp.entity.Category;
import com.mp.service.CategoryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 添加分类
     * @param categoryName
     * @param parentId
     * @return
     */
    public ServerResponse<String> addCategory(String categoryName, Integer parentId) {
        if(StringUtils.isBlank(categoryName)) {
            return ServerResponse.createByErrorMessage("分类名称不能为空");
        }
        Category category = new Category();
        category.setName(categoryName);
        category.setCreateTime(new Date());
        category.setParentId(parentId);

        int resultCount = categoryMapper.insertSelective(category);
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
    public ServerResponse<List<Category>> selectCategory() {
        List<Category> categoryList = categoryMapper.selectCategory();
        return ServerResponse.createBySuccess(categoryList);
    }
}
