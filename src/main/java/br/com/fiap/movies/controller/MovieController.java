package br.com.fiap.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.movies.model.Movie;
import br.com.fiap.movies.repository.MovieRepository;

@Controller
public class MovieController {
	
	@Autowired
	private MovieRepository repository;
	
	@RequestMapping("/")
	public String index() {
		return  "index";
	}
	
	@GetMapping("/create")
	public String create() {
		return  "form";
	}
	
	@PostMapping("/create")
	public String save(Movie movie, RedirectAttributes redirect) {
		repository.save(movie);
		redirect.addFlashAttribute("message", "filme cadastrado com sucesso");
		return  "redirect:/";
	}
	
	@GetMapping("/about")
	public String about() {
		return  "about";
	}


}
