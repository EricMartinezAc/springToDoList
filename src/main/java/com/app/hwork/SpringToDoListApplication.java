package com.app.hwork;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.app.hwork.Entities.Task;
import com.app.hwork.repo.TaskRepo;

@SpringBootApplication
public class SpringToDoListApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringToDoListApplication.class, args);
	}
	
	@Autowired
	private TaskRepo repo;

	@Override
	public void run(String... args) throws Exception {
		
	}
	
	
	

}
