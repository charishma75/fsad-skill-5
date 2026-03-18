package com.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration   // Step A
@ComponentScan("com.example")   // Step B
public class AppConfig {
}