package com.mp.service;

import com.mp.common.ServerResponse;
import com.mp.entity.Category;
import com.mp.vo.CategoryTreeVo;

import java.util.List;

public interface CategoryService {
    ServerResponse<String> addCategory(Category category);
    ServerResponse<String> updateCategory(Category category);
    ServerResponse<String> deleteCategory(Integer id);
    ServerResponse<List<CategoryTreeVo>> selectCategory();
}
