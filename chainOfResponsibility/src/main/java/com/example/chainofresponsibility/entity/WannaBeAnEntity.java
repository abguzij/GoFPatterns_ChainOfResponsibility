package com.example.chainofresponsibility.entity;

import com.example.chainofresponsibility.validation.Validatable;

public class WannaBeAnEntity implements Validatable {
    private String string;
    private Integer integer;
    private Boolean aBoolean;

    public WannaBeAnEntity() {
    }

    public String getString() {
        return string;
    }

    public WannaBeAnEntity setString(String string) {
        this.string = string;
        return this;
    }

    public Integer getInteger() {
        return integer;
    }

    public WannaBeAnEntity setInteger(Integer integer) {
        this.integer = integer;
        return this;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public WannaBeAnEntity setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
        return this;
    }
}
