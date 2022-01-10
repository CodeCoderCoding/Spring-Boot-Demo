package com.supremepole.b04springbootcachesingle;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * @author CodeCoderCoding
 */
@Repository
public class WebsiteDao {
    @Cacheable("c1")
    public Website getWebsiteId(Integer id){
        Website website=new Website();
        website.setId(id);
        website.setName("supremepole");
        website.setUrl("https://cs.supremepole.com");
        return website;
    }
}
