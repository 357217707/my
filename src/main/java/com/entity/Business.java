package com.entity;

public class Business {
    private Integer id;

    private String name;

    private String area;

    private String address;

    private String image;

    private Integer num;

    private String introduce;

    private String phone;

    private String openTime;

    public Business(Integer id, String name, String area, String address, String image, Integer num, String introduce, String phone, String openTime) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.address = address;
        this.image = image;
        this.num = num;
        this.introduce = introduce;
        this.phone = phone;
        this.openTime = openTime;
    }

    public Business() {
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime == null ? null : openTime.trim();
    }
}