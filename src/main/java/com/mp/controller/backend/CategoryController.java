package com.mp.controller.backend;

import com.mp.common.ServerResponse;
import com.mp.entity.Category;
import com.mp.service.CategoryService;
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

    @RequestMapping("getCategoryList.do")
    @ResponseBody
    public ServerResponse<List<Category>> getCategoryList(){
        return categoryService.selectCategory();
    }
}
