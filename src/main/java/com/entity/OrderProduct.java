package com.entity;

public class OrderProduct {
    private Integer id;

    private Integer oid;

    private String name;

    private Double price;

    private Integer pid;

    private String pimage;

    private Integer num;

    private Integer evaStatus;

    public OrderProduct(Integer id, Integer oid, String name, Double price, Integer pid, String pimage, Integer num, Integer evaStatus) {
        this.id = id;
        this.oid = oid;
        this.name = name;
        this.price = price;
        this.pid = pid;
        this.pimage = pimage;
        this.num = num;
        this.evaStatus = evaStatus;
    }

    public OrderProduct() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage == null ? null : pimage.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getEvaStatus() {
        return evaStatus;
    }

    public void setEvaStatus(Integer evaStatus) {
        this.evaStatus = evaStatus;
    }
}