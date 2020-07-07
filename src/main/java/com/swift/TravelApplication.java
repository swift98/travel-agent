package com.swift;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@MapperScan("com.swift.*")
@SpringBootApplication
@Controller
public class TravelApplication {

    @RequestMapping("/*")
    public String home() {
//        return "test";
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(TravelApplication.class, args);
    }

}
