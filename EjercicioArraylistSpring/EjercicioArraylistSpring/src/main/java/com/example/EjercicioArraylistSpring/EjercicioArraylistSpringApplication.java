package com.example.EjercicioArraylistSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.EjercicioArraylistSpring")
public class EjercicioArraylistSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(EjercicioArraylistSpringApplication.class, args);
	}
}
