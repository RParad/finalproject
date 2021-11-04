package com.software.institute.finalproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


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

	@GetMapping("/films/{film_id}")
	public @ResponseBody Film findByID(@PathVariable("film_id")int film_id) {
	Film filmByID = filmRepository.findById(film_id).orElse(null);
		return filmByID;
	}

	///////////////////// Create function \\\\\\\\\\\\

	@PostMapping("/addFilm")
	public @ResponseBody
	String newFilm(@RequestParam int film_id, @RequestParam String title, @RequestParam int length, @RequestParam int language_id) {
		Film savedFilm = new Film(film_id, title, length, language_id);
		filmRepository.save(savedFilm);
		return "Film Has Been Added";
	}


	////////////////////////Delete\\\\\\\\\\\\\\\\\\\\\\\\
	@DeleteMapping("/removeFilm/{film_id}")
	public @ResponseBody String deleteFilm(@PathVariable("film_id") int film_id) {
		filmRepository.deleteById(film_id);
		return "Film deleted.";
	}


	//////////////////////Update\\\\\\\\\\\\\\\\\\\\\\\\\\
	@PutMapping("/films/{film_id}")
	public @ResponseBody String editFilm(@PathVariable ("film_id") int film_id) {
		return "Film has been Changed";
	}


	//@GetMapping("/actor")
	//public @ResponseBody Iterable<Actor> getAllActors() {
	//	return ActorRepository.findAll();
//	}
}
