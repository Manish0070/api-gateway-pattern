package com.stackroute.gatewaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewaydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewaydemoApplication.class, args);
	}

}
