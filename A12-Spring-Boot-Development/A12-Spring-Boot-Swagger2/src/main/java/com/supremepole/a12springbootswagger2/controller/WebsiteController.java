package com.supremepole.a12springbootswagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
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

    @ApiOperation(value="get user data")
    @ApiImplicitParam(paramType = "Integer", name="id", value="user id", required = true)
    @GetMapping("/user/{id}")
    public Integer getUserData(@PathVariable Integer id){
        return id;
    }

}
