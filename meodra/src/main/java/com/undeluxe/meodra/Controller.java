package com.undeluxe.meodra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String test(){
        return "섹스섹스!!!";
    }

    @GetMapping("/get")
    public String gettest(){
        return "get test ㅋ";
    }
}
