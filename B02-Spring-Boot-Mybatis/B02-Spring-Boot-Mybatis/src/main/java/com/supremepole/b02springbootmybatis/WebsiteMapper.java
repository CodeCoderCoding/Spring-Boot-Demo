package com.supremepole.b02springbootmybatis;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author CodeCoderCoding
 */
@Mapper
public interface WebsiteMapper {
    int addWebsite(Website website);
    int deleteWebsiteById(Integer id);
    int updateWebsite(Website website);
    Website getWebsiteById(Integer id);
    List<Website> getAllWebsites();
}
