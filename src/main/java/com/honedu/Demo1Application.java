package com.honedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.support.SpringDecoder;


@EnableFeignClients
@SpringBootApplication(scanBasePackages = {"com.honedu"}, exclude = {DataSourceAutoConfiguration.class})
public class Demo1Application {


    public static void main(String[] args) {

        SpringApplication.run(Demo1Application.class, args);
    }


}
