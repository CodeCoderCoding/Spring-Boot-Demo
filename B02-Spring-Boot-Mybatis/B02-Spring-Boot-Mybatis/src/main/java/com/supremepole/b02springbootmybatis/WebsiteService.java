package com.supremepole.b02springbootmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CodeCoderCoding
 */
@Service
public class WebsiteService {
    @Autowired
    WebsiteMapper websiteMapper;
    public int addWebsite(Website website) {
        return websiteMapper.addWebsite(website);
    }
    public int updateWebsite(Website website) {
        return websiteMapper.updateWebsite(website);
    }
    public int deleteWebsiteById(Integer id) {
        return websiteMapper.deleteWebsiteById(id);
    }
    public Website getWebsiteById(Integer id) {
        return websiteMapper.getWebsiteById(id);
    }
    public List<Website> getAllWebsites() {
        return websiteMapper.getAllWebsites();
    }
}
