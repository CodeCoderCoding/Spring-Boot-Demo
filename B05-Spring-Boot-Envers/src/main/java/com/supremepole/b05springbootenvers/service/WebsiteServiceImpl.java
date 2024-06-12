package com.supremepole.b05springbootenvers.service;

import com.supremepole.b05springbootenvers.dao.WebsiteDao;
import com.supremepole.b05springbootenvers.entity.Website;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebsiteServiceImpl implements WebsiteService{

    @Autowired
    private WebsiteDao websiteDao;

    @Override
    public Website getWebsite(int id) {
        return websiteDao.findById(id).get();
    }
}
