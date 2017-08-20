package com.project.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.project.controller", "com.project.util", "com.project.service"})
public class Application {
	
	public static void main(String args[])
	{
		SpringApplication.run(Application.class, args);
	}

}
