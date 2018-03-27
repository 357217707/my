package com.entity;

import java.util.Date;

public class Address {
    private Integer id;

    private String detail;

    private String phone;

    private String zip;

    private String remark;

    private Integer uid;

    private Date createTime;

    private Date uodateTime;

    private Integer pid;

    private Integer oid;

    private String name;

    public Address(Integer id, String detail, String phone, String zip, String remark, Integer uid, Date createTime, Date uodateTime, Integer pid, Integer oid,String name) {
        this.id = id;
        this.detail = detail;
        this.phone = phone;
        this.zip = zip;
        this.remark = remark;
        this.uid = uid;
        this.createTime = createTime;
        this.uodateTime = uodateTime;
        this.pid = pid;
        this.oid = oid;
        this.name = name;
    }

    public Address() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUodateTime() {
        return uodateTime;
    }

    public void setUodateTime(Date uodateTime) {
        this.uodateTime = uodateTime;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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
        this.name = name;
    }
}