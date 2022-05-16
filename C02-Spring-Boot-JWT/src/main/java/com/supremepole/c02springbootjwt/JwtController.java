package com.supremepole.c02springbootjwt;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName JwtController
 * @Description
 * @Date 2022/5/12 20:03
 * @Version 1.0.0
 **/
@RestController
public class JwtController {

    @PostMapping("/get")
    public String creatToken(){
        User user = new User();
        user.setId("1");
        user.setUsername("SupremePole");
        user.setPassword("https://cs.supremepole.com");
        return JwtUtil.createJWT(40000,user);
    }

    @PostMapping("/test")
    public String testToken(HttpServletRequest request, HttpServletResponse response){
        String token= request.getHeader("Authorization");
        User user = new User();
        user.setId("1");
        user.setUsername("SupremePole");
        user.setPassword("https://cs.supremepole.com");
        if (JwtUtil.isVerify(token,user)){
            return "success";
        }
        return "fail";
    }
}
