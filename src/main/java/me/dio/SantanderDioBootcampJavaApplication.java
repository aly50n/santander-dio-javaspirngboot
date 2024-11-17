package me.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(servers= {@Server(url="/", description = "defult server URL")})
@SpringBootApplication
public class SantanderDioBootcampJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderDioBootcampJavaApplication.class, args);
	}

}
