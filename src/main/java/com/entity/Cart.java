package com.entity;

import java.util.Date;

public class Cart {
    private Integer id;

    private String pname;

    private Date time;

    private String image;

    private Double price;

    private Integer num;

    private Integer uid;

    private Integer bid;

    private Integer pid;

    private Integer saleState;

    private Double total;

    public Cart(Integer id, String pname, Date time, String image, Double price, Integer num, Integer uid, Integer bid, Integer pid, Integer saleState) {
        this.id = id;
        this.pname = pname;
        this.time = time;
        this.image = image;
        this.price = price;
        this.num = num;
        this.uid = uid;
        this.bid = bid;
        this.pid = pid;
        this.saleState = saleState;
    }

    public Cart() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getSaleState() {
        return saleState;
    }

    public void setSaleState(Integer saleState) {
        this.saleState = saleState;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}