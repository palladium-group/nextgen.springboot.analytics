package com.nextgen.analytics.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private UUID tenantId;
    private String name;
    private String icon;
    private String color;
    private Boolean hasChildren;

    public Category() {
        super();
    }

    public Category(UUID tenantId, String name, String icon, String color, Boolean hasChildren) {
        super();
        this.tenantId = tenantId;
        this.name = name;
        this.icon = icon;
        this.color = color;
        this.hasChildren = hasChildren;
    }

    public UUID getTenantId() {
        return tenantId;
    }

    public void setTenantId(UUID tenantId) {
        this.tenantId = tenantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }
}
