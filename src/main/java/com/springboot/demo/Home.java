package com.springboot.demo;

public class Home {
    private String id;
    private String name;

    private String detail;

    @Override
    public String toString() {
        return "Home{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }

    public Home(String id, String name, String detail) {
        this.id = id;
        this.name = name;
        this.detail = detail;
    }

    public Home() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }



    public void setDetail(String detail) {
        this.detail = detail;
    }









}
