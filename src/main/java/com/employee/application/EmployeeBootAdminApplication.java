package com.employee.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableEurekaClient
@EnableAdminServer
@SpringBootApplication
public class EmployeeBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeBootAdminApplication.class, args);
	}

}
