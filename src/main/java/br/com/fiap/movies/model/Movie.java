package br.com.fiap.movies.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "filmes")
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
	
	@Column(name = "poster")
	private String poster;
	
	public String getPoster() {
		if(poster == null) return "";
		
		return this.poster;
	}
	
	
}
