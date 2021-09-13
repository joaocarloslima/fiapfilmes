package br.com.fiap.movies.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Movie {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idfilme")
	private Long id;
	
	@Column(name = "descrfilme")
	private String description;
	
	@Column(name = "dtfilme")
	private int year;

	@Column(name = "rating")
	private int rating;
}
