package com.supremepole.c01springbootsecuritymemory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class SecurityController {
    @GetMapping("/admin/my")
    public String admin(){
        return "admin";
    }
    @GetMapping("/user/my")
    public String user(){
        return "user";
    }
}
