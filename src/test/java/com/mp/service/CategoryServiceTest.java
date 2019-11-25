package com.mp.service;

import com.mp.BaseTest;
import com.mp.common.ServerResponse;
import com.mp.entity.Category;
import com.mp.vo.CategoryTreeVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceTest extends BaseTest {
    @Autowired
    private CategoryService categoryService;
    @Test
    public void addCategoryTest() {
        Category category = new Category();
        category.setName("解决方案");
        ServerResponse response = categoryService.addCategory(category);
        System.out.println(response.isSuccess());
    }
    @Test
    public void updateCategoryTest() {
        Category category = new Category();
        category.setId(3);
        category.setName("产品展示2");
        ServerResponse response = categoryService.updateCategory(category);
        System.out.println(response.isSuccess());
    }
    @Test
    public void selectCategoryTest(){
        ServerResponse response = categoryService.selectCategory();
        System.out.println(response.getData());
    }
}
