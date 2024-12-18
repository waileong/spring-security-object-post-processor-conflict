package com.example.springsecurityobjectpostprocessorconflict;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.socket.EnableWebSocketSecurity;


@AutoConfiguration
@EnableWebSocketSecurity
@ComponentScan(basePackageClasses = TestController.class)
public class TestAutoConfiguration {
}
