package com.example.graduatedesign;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.graduatedesign.mapper")
public class GraduatedesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraduatedesignApplication.class, args);
    }

}
