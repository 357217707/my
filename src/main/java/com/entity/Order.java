package com.entity;

import java.util.Date;

public class Order {
    private Integer id;

    private Date createTime;

    private Integer uid;

    private Double total;

    private String address;

    private Integer shipStatus;

    private Integer payStatus;

    private Integer aid;

    private Integer evaStatus;


    public Order(Integer id, Date createTime, Integer uid, Double total, String address, Integer shipStatus, Integer payStatus, Integer aid, Integer evaStatus) {
        this.id = id;
        this.createTime = createTime;
        this.uid = uid;
        this.total = total;
        this.address = address;
        this.shipStatus = shipStatus;
        this.payStatus = payStatus;
        this.aid = aid;
        this.evaStatus = evaStatus;
    }

    public Integer getEvaStatus() {
        return evaStatus;
    }

    public void setEvaStatus(Integer evaStatus) {
        this.evaStatus = evaStatus;
    }

    public Order() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(Integer shipStatus) {

        this.shipStatus = shipStatus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }


}

