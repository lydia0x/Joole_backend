package com.joole.fans.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class HomeController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHomeInfo() {
        return "Hello World!";
    }
}