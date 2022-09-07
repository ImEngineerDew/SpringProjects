package com.toadsdewin.basicCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@SpringBootApplication
public class BasicCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicCrudApplication.class, args);
	}|
	@GetMapping
	public String welcomeMessage()
	{
		return "Welcome to the basicCRUD!";
	}
}

	/**
	@GetMapping(path = "/laconchadelalora")
	public List<String> message()
	{
		return List.of("La","Concha","de","la","lora");
	}
	**/


