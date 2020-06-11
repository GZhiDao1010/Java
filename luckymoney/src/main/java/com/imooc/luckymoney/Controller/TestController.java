package com.imooc.luckymoney.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "test hello1123333";
    }

    @GetMapping("/hello2")
    public String hello2(){
        return "test hello----1111222223333";
    }
}
