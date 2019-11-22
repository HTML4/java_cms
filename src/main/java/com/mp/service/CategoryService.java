package com.mp.service;

import com.mp.common.ServerResponse;
import com.mp.entity.Category;

import java.util.List;

public interface CategoryService {
    ServerResponse<String> addCategory(String categoryName, Integer parentId);
    ServerResponse<String> updateCategory(Category category);
    ServerResponse<List<Category>> selectCategory();
}
