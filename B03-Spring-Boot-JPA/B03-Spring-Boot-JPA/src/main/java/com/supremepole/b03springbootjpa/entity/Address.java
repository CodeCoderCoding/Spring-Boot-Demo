package com.supremepole.b03springbootjpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName Address
 * @Description
 * @Date 2022/8/8 12:34
 * @Version 1.0.0
 **/
@Entity(name="address")
public class Address {
    @Id
    private long id;
    private String street;
    private String number;

    public Address() {
    }

    public Address(long id, String street, String number) {
        this.id = id;
        this.street = street;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
