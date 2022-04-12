package com.formacionspringboot.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info= @Info(title="API Clientes",version="1.0",description="Crud completo de Clientes"))
public class SpringJavaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJavaRestApplication.class, args);
	}

}
