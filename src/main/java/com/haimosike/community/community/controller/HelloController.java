package com.haimosike.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

/**
 * Created by 海默斯克 on 2020/7/13 13:46
 */
@Controller
public class HelloController {
    @GetMapping("/jingdu")
    public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name);
            return"jingdu";
    }
}
