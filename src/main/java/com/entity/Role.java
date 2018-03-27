package com.entity;

public class Role {
    private Integer id;

    private String name;

    private String ename;

    private Integer type;

    public Role(Integer id, String name, String ename, Integer type) {
        this.id = id;
        this.name = name;
        this.ename = ename;
        this.type = type;
    }

    public Role() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}