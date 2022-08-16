package com.applicationlogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LoginApplication  {

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
		System.out.println("heeeeeee");
	}

}
