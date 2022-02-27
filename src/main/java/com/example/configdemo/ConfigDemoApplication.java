package com.example.configdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigDemoApplication {

    @Value("${developer.key.value: DefaultValue}")
    private String configMapString;

    public static void main(String[] args) {
        SpringApplication.run(ConfigDemoApplication.class, args);
    }

    @GetMapping("/")
    String home() {
        return "Hello From config".concat(configMapString);
    }

}
