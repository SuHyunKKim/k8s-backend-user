package com.welab.k8sbackenduser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class K8sBackendUserApplication {

    public static void main(String[] args) {
        System.out.println("Jenkins build trigger");
        SpringApplication.run(K8sBackendUserApplication.class, args);
    }
}