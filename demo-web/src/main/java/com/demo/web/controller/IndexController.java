package com.demo.web.controller;

import com.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class IndexController {
    @Autowired
    private DemoService demoService;

    @GetMapping("test")
    public String test() {



        return demoService.test();
    }
}
