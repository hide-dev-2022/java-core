package com.anonymous.javathecompletereferenceeleventhedition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Java the complete reference eleventh edition Service API", version = "1.0.0", description = "Java the complete reference eleventh edition Service API v1.0"))
public class JavaTheCompleteReferenceEleventhEditionApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaTheCompleteReferenceEleventhEditionApplication.class, args);
	}

}
