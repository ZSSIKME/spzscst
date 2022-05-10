package com.spz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class StuApplication {
    public static void main(String[] args) {
        SpringApplication.run(StuApplication.class,args);
    }
}
