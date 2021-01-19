package com.zerofanta.cccdms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class CccdmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CccdmsApplication.class, args);
    }

}
