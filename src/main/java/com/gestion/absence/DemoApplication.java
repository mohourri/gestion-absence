package com.gestion.absence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;


@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoApplication.class);
    }



}
