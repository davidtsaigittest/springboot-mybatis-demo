package com.example.springbootmybatisdemo.controller;

import com.example.springbootmybatisdemo.bean.TestRequest;
import com.example.springbootmybatisdemo.bean.TestResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopController {

    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("hello");
        return "hello";
    }

    @GetMapping("/datetime")
    public TestResponse dateTime(@RequestBody TestRequest req) {
        return TestResponse.builder().dateOfResponse(req.getDateOfQuery()).build();
    }
}
