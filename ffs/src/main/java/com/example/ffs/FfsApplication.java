package com.example.ffs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.annotation.Documented;

@SpringBootApplication
public class FfsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FfsApplication.class, args);
	}

}

record Movie (Integer id, String title) {
}