package com.shishi.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author huangqf
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CodeGeneratorApp {
    public static void main(String[] args) {
        SpringApplication.run(CodeGeneratorApp.class, args);
    }
}
