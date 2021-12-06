package com.mycompany.sweetmall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SweetmallThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SweetmallThirdPartyApplication.class, args);
    }

}
