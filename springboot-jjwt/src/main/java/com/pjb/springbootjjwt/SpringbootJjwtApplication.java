package com.pjb.springbootjjwt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pjb.springbootjjwt.mapper")
public class SpringbootJjwtApplication {

    //https://www.jianshu.com/p/e88d3f8151db
    public static void main(String[] args) {
        SpringApplication.run(SpringbootJjwtApplication.class, args);
    }
}
