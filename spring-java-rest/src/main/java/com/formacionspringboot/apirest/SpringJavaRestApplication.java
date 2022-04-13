package com.formacionspringboot.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info= @Info(title="API Clientes",version="1.0",description="Crud completo de Clientes"))
public class SpringJavaRestApplication implements CommandLineRunner{
	
	@Autowired
	private BCryptPasswordEncoder passwordEncorder;

	public static void main(String[] args) {
		SpringApplication.run(SpringJavaRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		String password = "12345";
		
		for (int i = 0; i < 2; i++) {
			String passwordEncryptado = passwordEncorder.encode(password);
			System.out.println(passwordEncryptado);
		}
		
	}

}
