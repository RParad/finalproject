package com.software.institute.finalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping("/film")
public class FinalprojectApplication {

	@Autowired
	private FilmRepository filmRepository;

	public static void main(String[] args) {
		SpringApplication.run(FinalprojectApplication.class, args);
	}


	@GetMapping("/film")
	public @ResponseBody Iterable<Film> getAllFilms() {
	return filmRepository.findAll();
	}

	//@GetMapping("/actor")
	//public @ResponseBody Iterable<Actor> getAllActors() {
	//	return ActorRepository.findAll();
//	}
	//@PostMapping("/addFilm")
	//public @ResponseBody String addAFilm (@RequestParam String title, @RequestParam releaseyear,@RequestParam int length @RequestParam String rating) {
		//Film savedFilm = new Film(title, releaseyear, length, rating, description);
	//	filmRepository.save(savedFilm);
	//	return "Saved";
//	}
//	@PostMapping("/addActor")
	//public @ResponseBody String addAnActor (RequestParam int actor_id, @RequestParam String firstName, @RequestParam String lastName, @RequestParam Date last_update) {

//		Actor savedActor = new Actor(actor_id, firstName, lastName, last_update);
//		actorRepository.save.savedActor;
	//	return "Saved";

//	}
}
