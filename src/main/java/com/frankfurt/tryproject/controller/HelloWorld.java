package com.frankfurt.tryproject.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public Map<String,Object> hello(){
        Map<String,Object> map =new HashMap<>();
        map.put("hello","world");
        return map;
    }

}
