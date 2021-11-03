package com.software.institute.finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@SpringBootApplication
@RestController
public class FinalprojectApplication {

	@Autowired
	private FilmRepository filmRepository;

	public static void main(String[] args) {
		SpringApplication.run(FinalprojectApplication.class, args);
	}

	/////////////////////// Read Function \\\\\\\\\\\\\\\\\\\\\\\\\\
	@GetMapping("/films")
	public @ResponseBody Iterable<Film> getAllUsers(){
		return filmRepository.findAll();
	}

	@GetMapping("/filmsByID")
	public @ResponseBody
	Optional<Film> getAllUsers4() {
		return filmRepository.findById(6);
	}

	///////////////////// Create function \\\\\\\\\\\\

	@PostMapping("/addFilm")
	public @ResponseBody
	String newFilm(@RequestParam int film_id, @RequestParam String title, @RequestParam int length, @RequestParam int language_id) {

		Film savedFilm = new Film(film_id, title, length, language_id);
		filmRepository.save(savedFilm);
		return "Film Has Been Added";
	}
	//@GetMapping("/actor")
	//public @ResponseBody Iterable<Actor> getAllActors() {
	//	return ActorRepository.findAll();
//	}
}
