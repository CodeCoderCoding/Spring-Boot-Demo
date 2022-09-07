package com.supremepole.b03springbootjpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @ClassName User
 * @Description
 * @Date 2022/8/8 12:32
 * @Version 1.0.0
 **/
@Entity(name="employee")
public class Employee {
    @Id
    private long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Employee() {
    }

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
