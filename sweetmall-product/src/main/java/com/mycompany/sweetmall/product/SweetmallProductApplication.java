package com.mycompany.sweetmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@MapperScan("com.mycompany.sweetmall.product.dao")
@SpringBootApplication
public class SweetmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SweetmallProductApplication.class, args);
    }

}
