package com.nextgen.analytics.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "category_links")
public class CategoryLinks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private String url;
    private String color;
    @Column(nullable = true)
    private UUID parent_id;
    private Integer columnOrder;

    public CategoryLinks(String name, String url, String color, UUID parent_id, Integer order) {
        super();
        this.name = name;
        this.url = url;
        this.color = color;
        this.parent_id = parent_id;
        this.columnOrder = order;
    }

    public CategoryLinks() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public UUID getParent_id() {
        return parent_id;
    }

    public void setParent_id(UUID parent_id) {
        this.parent_id = parent_id;
    }

    public Integer getOrder() {
        return columnOrder;
    }

    public void setOrder(Integer order) {
        this.columnOrder = order;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
