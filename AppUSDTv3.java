package com.example.usdtv3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.example.usdtv3.mapper")
public class AppUSDTv3 {

    public static void main(String[] args) {
        SpringApplication.run(AppUSDTv3.class, args);
    }

}
