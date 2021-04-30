package com.example.ajax.student;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.ajax.student.StudentRepository")
public class JpaConfig {

}
