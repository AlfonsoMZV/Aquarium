package com.aquarium.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AquariumEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AquariumEurekaServerApplication.class, args);
	}

}
