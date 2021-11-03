package com.software.institute.finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


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

	@GetMapping("/filmsByID")
	public @ResponseBody
	Optional<Film> getAllUsers4() {
		return filmRepository.findById(6);
	}
	//@GetMapping("/actor")
	//public @ResponseBody Iterable<Actor> getAllActors() {
	//	return ActorRepository.findAll();
//	}
}
