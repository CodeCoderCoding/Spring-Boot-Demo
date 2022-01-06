package com.supremepole.b03springbootmultijpa;

import com.supremepole.b03springbootmultijpa.model.Website;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author CodeCoderCoding
 */
@RestController
public class WebsiteController {
    @Autowired
    WebsiteService websiteService;
    @GetMapping("/add-website")
    public void addWebsite(){
        Website website=new Website();
        website.setId(1);
        website.setName("supremepole");
        website.setUrl("https://cs.supremepole.com");
        websiteService.addWebsite(website);
        Website website2=new Website();
        website2.setId(2);
        website2.setName("supremepole interview");
        website2.setUrl("https://interview.supremepole.com");
        websiteService.addWebsite(website2);
    }
    @GetMapping("/get-all-website")
    public List<Website> getWebsite(){
        return websiteService.getAllWebsites();
    }
    @GetMapping("/get-max-id-website")
    public Website getMaxIdWebsite(){
        return websiteService.getMaxIdWebsite();
    }

}
