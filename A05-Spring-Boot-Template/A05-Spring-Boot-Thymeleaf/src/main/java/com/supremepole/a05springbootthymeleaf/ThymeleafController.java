package com.supremepole.a05springbootthymeleaf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author CodeCoderCoding
 */
@RestController
public class ThymeleafController {
    @GetMapping("/thymeleaf")
    public ModelAndView thymeleaf(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name", "thymeleaf");
        modelAndView.setViewName("thymeleaf");
        return modelAndView;
    }
}
