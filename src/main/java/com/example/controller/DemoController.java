package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/api")
public class DemoController {
       @GetMapping("/welcome")
       public String welcome() {
    	   return "Welcome to demo application";
       }
       @GetMapping("/hello")
       public String hello() {
    	   return "Hello to demo application";
       }
       @GetMapping("/greeting")
       public String greeting() {
    	   return "Greeting to demo application";
       }
}
