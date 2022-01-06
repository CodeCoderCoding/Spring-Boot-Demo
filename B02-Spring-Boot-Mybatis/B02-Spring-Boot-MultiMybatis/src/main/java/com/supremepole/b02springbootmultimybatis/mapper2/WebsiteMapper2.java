package com.supremepole.b02springbootmultimybatis.mapper2;

import com.supremepole.b02springbootmultimybatis.Website;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author CodeCoderCoding
 */
public interface WebsiteMapper2 {
    int addWebsite(Website website);
    int deleteWebsiteById(Integer id);
    int updateWebsite(Website website);
    Website getWebsiteById(Integer id);
    List<Website> getAllWebsites();
}
