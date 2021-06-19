package ru.milandr.apiservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiService2Application {

    public static void main(String[] args) {
        SpringApplication.run(ApiService2Application.class, args);
    }

}
