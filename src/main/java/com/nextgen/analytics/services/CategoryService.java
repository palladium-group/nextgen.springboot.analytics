package com.nextgen.analytics.services;

import com.nextgen.analytics.models.Category;
import com.nextgen.analytics.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories()
    {
        return categoryRepository.findAll();
    }
}
