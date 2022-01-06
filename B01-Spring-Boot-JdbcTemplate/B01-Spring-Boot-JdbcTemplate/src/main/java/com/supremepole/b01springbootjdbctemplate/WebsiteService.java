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
    public int addBook(Website website) {
        return websiteDao.addWebsite(website);
    }
    public int updateBook(Website book) {
        return websiteDao.updateWebsite(book);
    }
    public int deleteBookById(Integer id) {
        return websiteDao.deleteWebsiteById(id);
    }
    public Website getBookById(Integer id) {
        return websiteDao.getWebsiteById(id);
    }
    public List<Website> getAllBooks() {
        return websiteDao.getAllWebsites();
    }
}
