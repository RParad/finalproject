package com.software.institute.finalproject;

import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class FinalprojectApplication {

	@Autowired
	private FilmRepository filmRepository;

	@Autowired
	private ActorRepository actorRepository;

	public static void main(String[] args) {
		SpringApplication.run(FinalprojectApplication.class, args);
	}

	/////////////////////// Read Function \\\\\\\\\\\\\\\\\\\\\\\\\\
	@GetMapping("/films")
	public @ResponseBody Iterable<Film> getAllFilms(){
		return filmRepository.findAll();
	}

	@GetMapping("/actors")
	public @ResponseBody Iterable<Actor> getAllActors(){
		return actorRepository.findAll();
	}

	@GetMapping("/films/{film_id}")
	public @ResponseBody Film findByID(@PathVariable("film_id")int film_id) {
	Film filmByID = filmRepository.findById(film_id).orElse(null);
		return filmByID;
	}
	@GetMapping("/actors/{actor_id}")
	public @ResponseBody Actor findById(@PathVariable("actor_id")int actor_id) {
		Actor actorByID = actorRepository.findById(actor_id).orElse(null);
		return actorByID;
	}

	///////////////////// Create function \\\\\\\\\\\\

	@PostMapping("/addFilm")
	public @ResponseBody
	String newFilm(@RequestParam int film_id, @RequestParam String title, @RequestParam Integer length, @RequestParam int language_id) {
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
	public ResponseEntity<Film> updateFilm(@PathVariable("film_id") int film_id,
			@RequestBody Film filmDetails) throws ResourceNotFoundException {
			Film film = filmRepository.findById(film_id).orElseThrow(() -> new ResourceNotFoundException("Film not found for this"));

			film.setLength(filmDetails.getLength());
			film.setFilm_id(filmDetails.getFilm_id());
			film.setLanguage_id(filmDetails.getLanguage_id());
			film.setTitle(filmDetails.getTitle());
		final Film updatedFilm = filmRepository.save(film);
		return ResponseEntity.ok(updatedFilm);
	}


}
