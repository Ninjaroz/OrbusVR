package com.app;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.app", "com.app.controllers", "com.app.repositories", "com.app.services", "com.app.models"})
@EntityScan(basePackages = {"com.app.models"})
@EnableJpaRepositories(basePackages = {"com.app.repositories"})
@EnableTransactionManagement
public class OrbusVRApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(OrbusVRApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
	    };     
	}
}
