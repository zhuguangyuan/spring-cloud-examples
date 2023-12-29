package com.neo.controller;

import com.neo.remote.IHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    IHello IHello;
	
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return IHello.hello(name);
    }
}