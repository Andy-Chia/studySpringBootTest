package com.one.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
