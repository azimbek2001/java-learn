package com.example.demo;

import com.example.demo.controller.Controller;
import com.example.demo.model.Model;
import com.example.demo.viewer.Viewer;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Viewer viewer = (Viewer) context.getBean("viewer");
	}

}
