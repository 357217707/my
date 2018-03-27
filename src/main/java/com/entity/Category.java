package com.entity;

public class Category {
    private Integer id;

    private String parentId;

    private String parentIds;

    private String name;

    private Integer orderby;

    public Category(Integer id, String parentId, String parentIds, String name, Integer orderby) {
        this.id = id;
        this.parentId = parentId;
        this.parentIds = parentIds;
        this.name = name;
        this.orderby = orderby;
    }

    public Category() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds == null ? null : parentIds.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getOrderby() {
        return orderby;
    }

    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
    }
}