package com.entity;

public class Menu {
    private Integer id;

    private String name;

    private String url;

    public Menu(Integer id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public Menu() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}