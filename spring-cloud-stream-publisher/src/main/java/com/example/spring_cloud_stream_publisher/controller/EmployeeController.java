package com.example.spring_cloud_stream_publisher.controller;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final StreamBridge streamBridge;

    public EmployeeController(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    @GetMapping("/publish")
    public String publishMessage() {
        streamBridge.send("employeeRegistration-out-0",
                "Employee registered via REST API");
        return "Message sent to RabbitMQ";
    }
}

