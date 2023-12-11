package com.nextgen.analytics.repository;

import com.nextgen.analytics.models.CategoryLinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryLinksRepository extends JpaRepository<CategoryLinks, UUID> {
}
