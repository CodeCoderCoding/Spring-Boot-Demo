package com.supremepole.b02springbootmultimybatis;

import com.supremepole.b02springbootmultimybatis.mapper1.WebsiteMapper;
import com.supremepole.b02springbootmultimybatis.mapper2.WebsiteMapper2;
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
    @Autowired
    WebsiteMapper2 websiteMapper2;
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
    public Website getWebsiteById2(Integer id) {
        return websiteMapper2.getWebsiteById(id);
    }
}
