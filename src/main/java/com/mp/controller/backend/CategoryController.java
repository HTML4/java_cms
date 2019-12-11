package com.mp.controller.backend;

import com.mp.common.ServerResponse;
import com.mp.entity.Category;
import com.mp.service.CategoryService;
import com.mp.vo.CategoryTreeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("getList.do")
    @ResponseBody
    public ServerResponse<List<CategoryTreeVo>> getCategoryList(){
        return categoryService.selectCategoryList();
    }
    @RequestMapping("${adminPath}/addOrUpdate.do")
    @ResponseBody
    public ServerResponse<String> addOrUpdate(Category category){
        if(category.getId() == null) {
            return categoryService.addCategory(category);
        }
        return categoryService.updateCategory(category);
    }
    @RequestMapping("${adminPath}/delete.do")
    @ResponseBody
    public ServerResponse<String> delete(Integer id){
        return categoryService.deleteCategory(id);
    }
    @RequestMapping("getDetail.do")
    @ResponseBody
    public ServerResponse<Category> getDetail(Integer id){
        return categoryService.selectCategory(id);
    }
}
