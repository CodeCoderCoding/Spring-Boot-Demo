package com.supremepole.c01springbootsecuritymethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class SecurityController {

    @Autowired
    MethodService methodService;

    @GetMapping("/method/user")
    public String methodUser() {
        String user = methodService.user();
        return user;
    }

    @GetMapping("/method/admin")
    public String methodAdmin() {
        String admin = methodService.admin();
        return admin;
    }

    @GetMapping("/method/dba")
    public String methodDba() {
        String dba = methodService.dba();
        return dba;
    }

}
