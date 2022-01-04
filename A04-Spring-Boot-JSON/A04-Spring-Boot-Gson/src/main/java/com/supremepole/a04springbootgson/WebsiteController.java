package com.supremepole.a04springbootgson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class WebsiteController {
    @GetMapping("/website")
    public Website website(){
        Website website=new Website();
        website.setId(1);
        website.setName("supremepole");
        website.setUrl("https://cs.supremepole.com");
        return website;
    }
}
