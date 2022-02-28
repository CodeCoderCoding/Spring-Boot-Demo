package com.supremepole.e01nacosprovider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeCoderCoding
 */
@RestController
public class HelloWorld {
    @GetMapping("/helloworld/{string}")
    public String helloWorld(@PathVariable String string) {
        return string;
    }
}
