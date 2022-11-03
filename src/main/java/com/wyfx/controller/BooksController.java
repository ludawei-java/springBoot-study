package com.wyfx.controller;

import com.wyfx.Bean.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/Books")
public class BooksController {
    @Value("${tempdir}")
    private String pathURL;
     @Autowired
    private Environment env;
     @Resource
     private MyDataSource myDataSource;
    @GetMapping("/getBook")
    public String getBook(){
        System.out.println("这是第一个SpringBoot 的应用程序！");
        System.out.println("tempdir=>"+pathURL);
        System.out.println(env.getProperty("server.port"));
        System.out.println("myDataSource=>"+myDataSource);
        return "hello springBoot";
    }
}
