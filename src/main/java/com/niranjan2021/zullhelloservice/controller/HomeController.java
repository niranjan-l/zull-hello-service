package com.niranjan2021.zullhelloservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @RequestMapping()
    public  String HelloService(@RequestHeader("x-location") String  location){
        return  "hello"+location;
    }
}
