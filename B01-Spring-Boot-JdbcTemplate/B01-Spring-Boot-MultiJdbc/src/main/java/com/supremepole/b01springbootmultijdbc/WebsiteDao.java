package com.supremepole.b01springbootmultijdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author CodeCoderCoding
 */
@Repository
public class WebsiteDao {
    @Resource(name="jdbcTemplateOne")
    JdbcTemplate jdbcTemplateOne;
    @Resource(name="jdbcTemplateTwo")
    JdbcTemplate jdbcTemplateTwo;
    public int addWebsite(Website website) {
        return jdbcTemplateTwo.update("INSERT INTO website(id,name,url) VALUES (?,?,?)",
                website.getId(), website.getName(), website.getUrl());
    }
    public int updateWebsite(Website website) {
        return jdbcTemplateTwo.update("UPDATE website SET name=?,url=? WHERE id=?",
                website.getName(), website.getUrl(), website.getId());
    }
    public int deleteWebsiteById(Integer id) {
        return jdbcTemplateTwo.update("DELETE FROM website WHERE id=?", id);
    }
    public Website getWebsiteById(Integer id) {
        return jdbcTemplateOne.queryForObject("select * from website where id=?",
                new BeanPropertyRowMapper<>(Website.class), id);
    }
    public List<Website> getAllWebsites() {
        return jdbcTemplateOne.query("select * from website",
                new BeanPropertyRowMapper<>(Website.class));
    }
}
