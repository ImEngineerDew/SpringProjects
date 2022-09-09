package com.toadsdewin.basicCrud;

import com.toadsdewin.basicCrud.Models.UserModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
public class BasicCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicCrudApplication.class, args);
	}
	/**
	@GetMapping
	public List<UserModel> welcomeMessage()
	{
		return List.of(new UserModel(1L,"Carlota","Manrique","Spain","carmanru1987@gmail.com","Trainee","Philosopher"));
	}
	**/
}

