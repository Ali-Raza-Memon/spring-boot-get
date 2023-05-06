package com.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Application {

	@Autowired
	private HomeServices homeServices;

	@RequestMapping("/home-page")
	public List<Home> getAllList(){
		return this.homeServices.getList();
	}





	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
