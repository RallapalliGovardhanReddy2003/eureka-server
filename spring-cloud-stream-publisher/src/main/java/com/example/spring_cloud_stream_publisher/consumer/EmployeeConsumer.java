package com.example.spring_cloud_stream_publisher.consumer;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class EmployeeConsumer {

    @Bean
    public Consumer<String> employeeRegistrationConsumer() {
        return message -> {
            System.out.println("Received message: " + message);
        };
    }
}
