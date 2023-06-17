package com.supremepole.a12springbootswagger2.controller;

import com.supremepole.a12springbootswagger2.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName WebsiteController
 * @Description
 * @Author yuzhihua
 * @Date 2022/4/20 20:54
 * @Version 1.0.0
 **/
@RestController
@Api(tags="User info data API")
public class WebsiteController {

    @ApiOperation(value="get user data by id")
    @ApiImplicitParam(paramType = "query", name="id", dataType = "int", value="user id", required = true)
    @GetMapping("/getUserById")
    public Integer getUserById( Integer id){
        return id;
    }

    @ApiOperation(value="get user data by id and name")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", name="id", dataType = "int", value="user id", required = true),
            @ApiImplicitParam(paramType = "path", name="name", dataType="String", value="user name", required = true)
    })
    @ApiImplicitParam(paramType = "Integer", name="id", value="user id", required = true)
    @GetMapping("/getUserByIdAndName/{id}/{name}")
    public User getUserByIdAndName(@PathVariable Integer id, @PathVariable String name){
        User user=new User(id, name);
        return user;
    }



}
