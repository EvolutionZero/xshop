package com.victoria.xshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.victoria.xshop.project.*.mapper")
public class XshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(XshopApplication.class, args);
    }
}
