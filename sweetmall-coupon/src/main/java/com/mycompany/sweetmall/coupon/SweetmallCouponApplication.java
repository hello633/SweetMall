package com.mycompany.sweetmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SweetmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(SweetmallCouponApplication.class, args);
    }

}
