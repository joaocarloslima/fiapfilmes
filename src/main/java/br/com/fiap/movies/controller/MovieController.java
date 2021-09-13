package br.com.fiap.movies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@RequestMapping("/")
	public String index() {
		return  "index";
	}
	
	@GetMapping("/create")
	public String create() {
		return  "form";
	}


}
