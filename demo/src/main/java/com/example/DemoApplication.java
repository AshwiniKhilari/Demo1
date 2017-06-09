package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println(" system out for git changess");
		SpringApplication.run(DemoApplication.class, args);
	}
}
