package com.entity;

import java.util.Date;

public class Product {
    private Integer id;

    private String name;

    private String image;

    private Double price;

    private Integer bid;

    private String label;

    private Integer num;

    private String introduce;

    private String category;

    private String categorys;

    private Date createtime;

    public Product(Integer id, String name, String image, Double price, Integer bid, String label, Integer num, String introduce, String category, String categorys, Date createtime) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.bid = bid;
        this.label = label;
        this.num = num;
        this.introduce = introduce;
        this.category = category;
        this.categorys = categorys;
        this.createtime = createtime;
    }

    public Product() {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getCategorys() {
        return categorys;
    }

    public void setCategorys(String categorys) {
        this.categorys = categorys == null ? null : categorys.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}