package com.entity;

import java.util.Date;

public class Evaluate {
    private Integer id;

    private Integer uid;

    private Integer bid;

    private Date time;

    private Double type;

    private String content;

    private Integer pid;

    private User user;

    public Evaluate(Integer id, Integer uid, Integer bid, Date time, Double type, String content, Integer pid) {
        this.id = id;
        this.uid = uid;
        this.bid = bid;
        this.time = time;
        this.type = type;
        this.content = content;
        this.pid = pid;
    }

    public Evaluate() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getType() {
        return type;
    }

    public void setType(Double type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}