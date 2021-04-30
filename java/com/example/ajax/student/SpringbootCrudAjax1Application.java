package com.example.ajax.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.ajax.student.*")
@EntityScan("com.example.ajax.student.*")
public class SpringbootCrudAjax1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudAjax1Application.class, args);
	}

}
