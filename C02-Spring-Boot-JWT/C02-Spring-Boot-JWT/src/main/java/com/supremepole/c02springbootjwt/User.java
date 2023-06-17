package com.supremepole.c02springbootjwt;

/**
 * @ClassName User
 * @Description
 * @Date 2022/5/12 20:07
 * @Version 1.0.0
 **/
public class User {

    private String id;
    private String username;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
