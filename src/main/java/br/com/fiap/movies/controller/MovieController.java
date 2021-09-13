package br.com.fiap.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.movies.model.Movie;
import br.com.fiap.movies.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MovieController {
	
	@Autowired
	private MovieRepository repository;
	
	@RequestMapping("/")
	public ModelAndView index(@RequestParam(required = false) String s) {
		ModelAndView modelAndView = new ModelAndView("index");
		if (s == null) {
			modelAndView.addObject("movies", repository.findAll());
			log.info("busca completa");
		}else {
			modelAndView.addObject("movies", repository.findByDescriptionContaining(s));
			log.info("busca por " + s);
		}
		
		return  modelAndView;
	}
	
	@GetMapping("/create")
	public String create() {
		return  "form";
	}
	
	@PostMapping("/create")
	public String save(Movie movie, RedirectAttributes redirect) {
		repository.save(movie);
		log.info("insert de filme " + movie);
		redirect.addFlashAttribute("message", "filme cadastrado com sucesso");
		return  "redirect:/";
	}
	
	@GetMapping("/about")
	public String about() {
		return  "about";
	}
	
	@GetMapping("/delete/{id}")
	public String about(@PathVariable Long id, RedirectAttributes redirect) {
		redirect.addFlashAttribute("message", "filme apagado com sucesso");
		log.info("delete de filme id=" + id);
		repository.deleteById(id);
		return  "redirect:/";
	}


}
