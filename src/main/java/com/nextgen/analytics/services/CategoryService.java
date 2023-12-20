package com.nextgen.analytics.services;

import com.nextgen.analytics.models.Category;
import com.nextgen.analytics.payload.request.NewCategoryRequest;
import com.nextgen.analytics.payload.request.UpdateCategoryRequest;
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
    public List<Category> getAllCategories(UUID tenantId) {
        return categoryRepository.findCategoryByTenantId(tenantId);
    }

    public Optional<Category> getCategoryById(UUID id) {
        return categoryRepository.findById(id);
    }

    public void updateCategory(UpdateCategoryRequest updateCategoryRequest) {
        Optional<Category> optionalCategory = categoryRepository.findById(updateCategoryRequest.getMenuId());
        if (optionalCategory.isPresent()) {
            Category category = optionalCategory.get();

            category.setName(updateCategoryRequest.getName());
            category.setColor(updateCategoryRequest.getColor());
            category.setIcon(updateCategoryRequest.getIcon());
            category.setParent(updateCategoryRequest.getParent());
            category.setUrl(updateCategoryRequest.getUrl());
            category.setMenuOrder(updateCategoryRequest.getOrder());

            categoryRepository.save(category);
        }
    }

    public void deleteCategory(UUID categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
