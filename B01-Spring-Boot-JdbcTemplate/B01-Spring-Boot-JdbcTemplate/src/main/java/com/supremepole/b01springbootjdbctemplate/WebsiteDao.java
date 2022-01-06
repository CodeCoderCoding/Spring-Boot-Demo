package com.supremepole.b01springbootjdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author CodeCoderCoding
 */
@Repository
public class WebsiteDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public int addWebsite(Website website) {
        return jdbcTemplate.update("INSERT INTO website(id,name,url) VALUES (?,?,?)",
                website.getId(), website.getName(), website.getUrl());
    }
    public int updateWebsite(Website website) {
        return jdbcTemplate.update("UPDATE website SET name=?,url=? WHERE id=?",
                website.getName(), website.getUrl(), website.getId());
    }
    public int deleteWebsiteById(Integer id) {
        return jdbcTemplate.update("DELETE FROM website WHERE id=?", id);
    }
    public Website getWebsiteById(Integer id) {
        return jdbcTemplate.queryForObject("select * from website where id=?",
                new BeanPropertyRowMapper<>(Website.class), id);
    }
    public List<Website> getAllWebsites() {
        return jdbcTemplate.query("select * from website",
                new BeanPropertyRowMapper<>(Website.class));
    }
}
