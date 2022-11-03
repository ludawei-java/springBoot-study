package com.wyfx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Books")
public class BooksController {
    @GetMapping("/getBook")
    public String getBook(){
        return "hello springBoot";
    }
}
