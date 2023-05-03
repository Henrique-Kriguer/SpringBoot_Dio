package com.kriguer.Springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/")
    public String HelloMessage(){
        return "Hello World, I', starting to code JAVA with Spring !!!";
    }
}
