package com.mp.service;

import com.mp.BaseTest;
import com.mp.common.ServerResponse;
import com.mp.entity.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceTest extends BaseTest {
    @Autowired
    private CategoryService categoryService;
    @Test
    public void addCategoryTest() {
        ServerResponse response = categoryService.addCategory("解决方案", null);
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
}
