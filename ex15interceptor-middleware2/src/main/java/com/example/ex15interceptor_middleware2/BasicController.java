package com.example.ex15interceptor_middleware2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/root")
public class BasicController {

    @GetMapping
    public String getGreetings() {
        return "Welcome user";
    }
}
