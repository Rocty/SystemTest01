package com.ahdy.system_test_01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ahdy.system_test_01.db.mapper")
public class SystemTest01Application {

    public static void main(String[] args) {
        SpringApplication.run(SystemTest01Application.class, args);
    }

}
