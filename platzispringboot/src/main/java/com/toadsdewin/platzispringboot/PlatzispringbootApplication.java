package com.toadsdewin.platzispringboot;

import com.toadsdewin.platzispringboot.Component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlatzispringbootApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;

	public PlatzispringbootApplication(@Qualifier("secondComponent") ComponentDependency componentDependency)
	{
		this.componentDependency = componentDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(PlatzispringbootApplication.class, args);
	}

	@Override
	public void run(String... args)  {
		componentDependency.message();
	}
}
