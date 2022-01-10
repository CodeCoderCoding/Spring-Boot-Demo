package com.supremepole.c01springbootsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class SecurityController {
    @GetMapping("/security")
    public String security(){
        return "https://cs.supremepole.com";
    }
}
