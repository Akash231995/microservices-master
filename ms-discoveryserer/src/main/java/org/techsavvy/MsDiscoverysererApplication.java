package org.techsavvy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsDiscoverysererApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsDiscoverysererApplication.class, args);
	}

}
