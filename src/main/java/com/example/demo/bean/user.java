package com.example.demo.bean;

import java.io.Serializable;

/**
 * @Params: user bean
 * @Author: Siya(Xiran) Yan
 * @Date: 11:07 1/12/20
 */

public class user implements Serializable {
    private String id;
    private String name;
    private String detail;

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