package kz.kazntu.lessons.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "kz.kazntu.lessons.controllers")
public class HelloWorldConfiguration {
}
