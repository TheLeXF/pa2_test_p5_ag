package com.uce.edu.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2TestP5AgApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Pa2TestP5AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Tarea de Git N°1");
		System.out.println("Alexis Guanoluisa");
		System.out.println("Cambios en el mismo branch");
	}

}
