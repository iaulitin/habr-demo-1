package com.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r
                        .path("/view/**")
                        .uri("lb://ui-service/"))
                .route(r -> r
                        .path("/api/hello/**")
                        .uri("lb://api-hello-service/"))
                .route(r -> r
                        .path("/api/goodbye/**")
                        .uri("lb://api-goodbye-service/"))
                .build();
    }
}
