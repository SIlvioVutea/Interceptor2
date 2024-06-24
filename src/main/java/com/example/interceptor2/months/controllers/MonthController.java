package com.example.interceptor2.months.controllers;

import com.example.interceptor2.months.models.Month;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/month")
public class MonthController {

    @GetMapping
    public Month get(HttpServletRequest request) {
        return (Month) request.getAttribute("MonthInterceptor-month");
    }


}
