package com.eureka.zuul.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;



@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class SpringEurekaZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaZuulApplication.class, args);
	}

}
