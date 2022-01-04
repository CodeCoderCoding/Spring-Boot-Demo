package com.supremepole.a04springbootfastjson;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author CodeCoderCoding
 */
public class Website {
    @JSONField(name="id")
    private int id;
    @JSONField(name="url")
    private String url;
    @JSONField(name="name")
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
}
