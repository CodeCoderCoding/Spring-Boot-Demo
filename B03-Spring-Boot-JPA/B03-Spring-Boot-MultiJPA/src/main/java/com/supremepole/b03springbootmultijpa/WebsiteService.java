package com.supremepole.b03springbootmultijpa;

import com.supremepole.b03springbootmultijpa.dao1.WebsiteDao;
import com.supremepole.b03springbootmultijpa.model.Website;
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
