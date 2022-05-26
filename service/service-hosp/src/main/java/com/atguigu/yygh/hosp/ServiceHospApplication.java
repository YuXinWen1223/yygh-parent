package com.atguigu.yygh.hosp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : 余欣文
 * @mingcheng : yygh-parent
 * @date :2022/5/18 21:45
 */

@SpringBootApplication
@ComponentScan("com.atguigu")
@EnableDiscoveryClient
@EnableFeignClients("com.atguigu")
public class ServiceHospApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHospApplication.class, args);
    }
}
