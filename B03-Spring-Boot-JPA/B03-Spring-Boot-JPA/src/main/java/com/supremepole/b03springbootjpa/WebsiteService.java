package com.supremepole.b03springbootjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CodeCoderCoding
 */
@Service
public class WebsiteService {
    @Autowired
    WebsiteDao websiteDao;
    public void addWebsite(Website website) {
        websiteDao.save(website);
    }
    public List<Website> getAllWebsites() {
        return websiteDao.findAll();
    }
    public Website getMaxIdWebsite(){
        return websiteDao.getMaxIdWebsite();
    }
}
