package com.nextgen.analytics.controllers;

import com.nextgen.analytics.models.CategoryLinks;
import com.nextgen.analytics.services.CategoryLinksService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/category-links")
public class CategoryLinksController {
    private CategoryLinksService categoryLinksService;

    public CategoryLinksController(CategoryLinksService categoryLinksService) {
        this.categoryLinksService = categoryLinksService;
    }

    @GetMapping
    public List<CategoryLinks> getAllCategoryLinks()
    {
        return categoryLinksService.getAllCategoryLinks();
    }
}
