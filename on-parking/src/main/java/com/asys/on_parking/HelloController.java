package com.asys.on_parking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping
public class HelloController {

    @GetMapping
    public String hola(){
        return "holaaaa";
    }



}
