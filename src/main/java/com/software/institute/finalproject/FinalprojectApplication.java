package com.software.institute.finalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
@RestController
public class FinalprojectApplication {

	@Autowired
	private FilmRepository filmRepository;

	public static void main(String[] args) {
		SpringApplication.run(FinalprojectApplication.class, args);
	}


	@GetMapping("/films")
	public @ResponseBody Iterable<Film> getAllUsers(){
		return filmRepository.findAll();
	}

	//@GetMapping("/actor")
	//public @ResponseBody Iterable<Actor> getAllActors() {
	//	return ActorRepository.findAll();
//	}
}
