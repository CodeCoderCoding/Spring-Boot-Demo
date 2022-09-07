package com.supremepole.b03springbootjpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class B03SpringBootJpaApplicationTests {

    @Autowired
    private WebsiteDao websiteDao;

    @Test
    public void add(){
        List<Website> websites=new ArrayList<>();
        Website website=new Website();
        website.setId(3);
        website.setName("supremepole interview");
        website.setUrl("https://interview.supremepole.com");
        websites.add(website);
        websiteDao.save(website);
    }

    @Test
    public void getWebsiteByName() {
        System.out.println(websiteDao.getWebsiteByName("supremepole"));
    }

    @Test
    public void getWebsiteByName_Dao(){
        System.out.println(websiteDao.getWebsiteByName("supremepole"));
    }

    @Test
    public void getWebsiteListById(){
        List<Website> websiteList=websiteDao.getWebsiteListById(1, "supremepole");
        System.out.println(websiteList.size());
    }

}
