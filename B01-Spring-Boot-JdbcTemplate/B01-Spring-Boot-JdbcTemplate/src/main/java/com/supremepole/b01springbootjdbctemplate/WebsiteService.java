package com.supremepole.b01springbootjdbctemplate;

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
    public int addWebsite(Website website) {
        return websiteDao.addWebsite(website);
    }
    public int updateWebsite(Website book) {
        return websiteDao.updateWebsite(book);
    }
    public int deleteWebsiteById(Integer id) {
        return websiteDao.deleteWebsiteById(id);
    }
    public Website getWebsiteById(Integer id) {
        return websiteDao.getWebsiteById(id);
    }
    public List<Website> getAllWebsites() {
        return websiteDao.getAllWebsites();
    }
}
