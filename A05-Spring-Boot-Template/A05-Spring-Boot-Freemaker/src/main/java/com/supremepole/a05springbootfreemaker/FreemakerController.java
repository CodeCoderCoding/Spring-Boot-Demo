package com.supremepole.a05springbootfreemaker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author CodeCoderCoding
 */
@RestController
public class FreemakerController {
    @GetMapping("/freemaker")
    public ModelAndView freemaker(){
        ModelAndView modelAndView=new ModelAndView("/freemaker");
        modelAndView.addObject("name", "freemaker");
        return modelAndView;
    }
}
