package com.supremepole.b05springbootenvers.entity;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RevisionListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

@Entity(name="teacher")
@Audited
@EntityListeners(RevisionListener.class)
public class Teacher extends BaseEntity{

    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
