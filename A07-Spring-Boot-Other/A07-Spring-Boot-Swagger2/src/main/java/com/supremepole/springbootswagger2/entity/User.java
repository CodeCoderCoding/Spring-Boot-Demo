package com.supremepole.a12springbootswagger2.entity;

/**
 * @ClassName User
 * @Description
 * @Date 2022/8/8 11:32
 * @Version 1.0.0
 **/
public class User {
    private Integer id;
    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
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
        this.name = name;
    }
}
