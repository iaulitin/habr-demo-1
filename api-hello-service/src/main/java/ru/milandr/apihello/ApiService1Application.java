package ru.milandr.apihello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiService1Application {

    public static void main(String[] args) {
        SpringApplication.run(ApiService1Application.class, args);
    }

}
