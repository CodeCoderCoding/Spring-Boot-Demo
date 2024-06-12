package com.supremepole.b06springbootauditing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.history.Revision;
import org.springframework.data.history.Revisions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class B06SpringBootAuditingApplicationTests {

    @Autowired
    private WebsiteDao websiteDao;
    @Autowired
    private WebsiteEntityRepository websiteEntityRepository;

    @Test
    public void add(){
        List<Website> websites=new ArrayList<>();
        Website website=new Website();
        website.setId(9);
        website.setName("supremepole website");
        website.setUrl("https://www.supremepole.com");
        websites.add(website);
        websiteDao.save(website);
    }

    @Test
    public void getRepository(){
        Revisions<Integer, Website> revisions=websiteDao.findRevisions(6);
        System.out.println("revisions");
        for(Revision<Integer, Website> revision:revisions){
            System.out.println(revision);
        }
        System.out.println("Single revision");
        Optional<Revision<Integer, Website>> optional=websiteDao.findRevision(6, 1);
        if(optional.isPresent()){
            System.out.println(optional.get());
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
