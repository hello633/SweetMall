package com.mycompany.sweetmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 1、想要远程调用别的服务
* 1）引入open—feign
* 2）编写一个接口，告诉SpringCloud这个接口需要调用远程服务
*   1、声明接口的每一个方法都是调用哪个远程服务的哪个请求
* 3）开启远程调用功能
*
* */
@SpringBootApplication
public class SweetmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SweetmallMemberApplication.class, args);
    }

}
