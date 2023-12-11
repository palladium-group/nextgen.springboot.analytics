package com.nextgen.analytics.services;

import com.nextgen.analytics.models.CategoryLinks;
import com.nextgen.analytics.repository.CategoryLinksRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryLinksService {
    private CategoryLinksRepository categoryLinksRepository;

    public CategoryLinksService(CategoryLinksRepository categoryLinksRepository) {
        this.categoryLinksRepository = categoryLinksRepository;
    }

    public List<CategoryLinks> getAllCategoryLinks()
    {
        return categoryLinksRepository.findAll();
    }
}
