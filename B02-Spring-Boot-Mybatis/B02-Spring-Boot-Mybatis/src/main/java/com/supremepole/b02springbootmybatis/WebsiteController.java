package com.supremepole.b02springbootmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/get-website")
    public Website getWebsite(){
        return websiteService.getWebsiteById(1);
    }
    @GetMapping("/update-website")
    public void updateWebsite(){
        Website website=new Website();
        website.setId(1);
        website.setName("supremepole algorithm");
        website.setUrl("https://algorithm.supremepole.com");
        websiteService.updateWebsite(website);
    }
    @GetMapping("/delete-website")
    public void deleteWebsite(){
        websiteService.deleteWebsiteById(2);
    }
}
