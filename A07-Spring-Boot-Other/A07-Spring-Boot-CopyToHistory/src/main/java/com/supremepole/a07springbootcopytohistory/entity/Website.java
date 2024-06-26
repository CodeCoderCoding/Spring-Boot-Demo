package com.supremepole.a07springbootcopytohistory.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author CodeCoderCoding
 */
@Entity(name="website")
public class Website {
    @Id
    private int id;
    private String url;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "id="+id+" ,name"+name+" ,url"+url;
    }
}
