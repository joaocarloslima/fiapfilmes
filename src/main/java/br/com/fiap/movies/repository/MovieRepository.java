package br.com.fiap.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.movies.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
