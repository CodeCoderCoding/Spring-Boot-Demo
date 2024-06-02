package com.supremepole.b05springbootenvers;

import com.supremepole.b05springbootenvers.Website;
import com.supremepole.b05springbootenvers.WebsiteDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.history.Revision;
import org.springframework.data.history.Revisions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class B05SpringBootEnversApplicationTests {

    @Autowired
    private WebsiteDao websiteDao;
    @Autowired
    private WebsiteEntityRepository websiteEntityRepository;

    @Test
    public void add(){
        List<Website> websites=new ArrayList<>();
        Website website=new Website();
        website.setId(8);
        website.setName("supremepole website");
        website.setUrl("https://www.supremepole.com");
        websites.add(website);
        websiteDao.save(website);
    }

    @Test
    public void getRepository(){
        Revisions<Integer, Website> revisions=websiteEntityRepository.findRevisions(6);
        System.out.println("revisions");
        for(Revision<Integer, Website> revision:revisions){
            System.out.println(revision);
        }
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
