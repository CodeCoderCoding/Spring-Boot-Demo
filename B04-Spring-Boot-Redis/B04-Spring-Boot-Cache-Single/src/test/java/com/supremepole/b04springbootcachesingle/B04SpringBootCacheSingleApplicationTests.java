package com.supremepole.b04springbootcachesingle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class B04SpringBootCacheSingleApplicationTests {

    @Autowired
    WebsiteDao websiteDao;

    @Test
    public void contextLoads() {
        //websiteDao.getWebsiteId(1);
        websiteDao.getWebsiteId(2);
        websiteDao.getWebsiteId(3);
    }

}
