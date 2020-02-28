package com.aquariumvanvptir.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VanVpTirAquariumClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(VanVpTirAquariumClientApplication.class, args);
	}

}
