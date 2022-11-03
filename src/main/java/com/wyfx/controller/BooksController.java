package com.wyfx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Books")
public class BooksController {
    @GetMapping("/getBook")
    public String getBook(){
        System.out.println("这是第一个SpringBoot 的应用程序！");
        return "hello springBoot";
    }
}
