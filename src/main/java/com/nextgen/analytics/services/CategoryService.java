package com.nextgen.analytics.services;

import com.nextgen.analytics.models.Category;
import com.nextgen.analytics.payload.request.NewCategoryRequest;
import com.nextgen.analytics.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void newCategory(NewCategoryRequest categoryRequest) {
        categoryRepository.save(new Category(categoryRequest.getTenantId(), categoryRequest.getName(), categoryRequest.getParent(), categoryRequest.getUrl(), categoryRequest.getIcon(), categoryRequest.getColor(), categoryRequest.getOrder()));
    }
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(UUID id) {
        return categoryRepository.findById(id);
    }
}
