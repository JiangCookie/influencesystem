package com.sitech.tc.influencesystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author JYH
 * 2019/3/1 10:13
 */
@Controller
public class BasicController {
    @GetMapping("/index")
    public String index(){
        return "index1";
    }


    @GetMapping("/form_basic")
    public String form_basic(){
        return "form_basic";
    }

    @GetMapping("/newform")
    public String newform(){
        return "newform1";
    }
}
