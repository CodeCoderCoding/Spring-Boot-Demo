package com.supremepole.b05springbootenvers.controller;

import com.supremepole.b05springbootenvers.entity.Website;
import com.supremepole.b05springbootenvers.service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebsiteController {

    @Autowired
    private WebsiteService websiteService;

    @RequestMapping(path = "/website/{id}", method = RequestMethod.GET)
    public Website findUser(@PathVariable("id") int id){
        return websiteService.getWebsite(id);
    }

}
