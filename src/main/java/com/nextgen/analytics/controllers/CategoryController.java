package com.nextgen.analytics.controllers;

import com.nextgen.analytics.models.Category;
import com.nextgen.analytics.payload.request.NewCategoryRequest;
import com.nextgen.analytics.payload.request.UpdateCategoryRequest;
import com.nextgen.analytics.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/category")
@CrossOrigin(origins = "*")
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<?> createNewCategory(@Valid @RequestBody NewCategoryRequest categoryRequest) {
        try {
            categoryService.newCategory(categoryRequest);
            return ResponseEntity.ok("OK");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
        }
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateCategory(@Valid @RequestBody UpdateCategoryRequest updateCategoryRequest) {
        try {
            categoryService.updateCategory(updateCategoryRequest);
            return ResponseEntity.ok("OK");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
        }
    }

    @GetMapping("{tenantId}")
    public List<Category> getAllCategories(@PathVariable UUID tenantId) {
        return categoryService.getAllCategories(tenantId);
    }

    @GetMapping("getCategoryById/{id}")
    public Optional<Category> getCategoryById(@PathVariable UUID id) {
        return categoryService.getCategoryById(id);
    }

    @DeleteMapping("deleteCategoryById/{id}")
    public ResponseEntity<?> deleteCategoryById(@PathVariable UUID id) {
        try {
            categoryService.deleteCategory(id);
            return ResponseEntity.ok("OK");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
        }
    }
}
