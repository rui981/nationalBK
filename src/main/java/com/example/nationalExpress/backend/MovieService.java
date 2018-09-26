package com.example.nationalExpress.backend;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dto.MovieDTO;
import dto.MoviesDTO;
import dto.Token;
import dto.TvDTO;
import dto.TvShowsDTO;

@Service("MovieService")
public class MovieService {

	private RestTemplate restTemplate = new RestTemplate();
	private String params= "?language=en-US&api_key=b51f316aae8c57c38fa870244f77731f";

	public MovieService() {
		
	}
	
	public MovieDTO getMovie(int id) {
		String url =  "https://api.themoviedb.org/3/movie/";
		MovieDTO movie = restTemplate.getForObject(url+id+params, MovieDTO.class);
		return movie;
	}

	public MoviesDTO getMovies(String searchText, int page) {
		String url =  "https://api.themoviedb.org/3/search/movie";
		String query = "&query=" + searchText+"&page="+page;
		MoviesDTO movies = restTemplate.getForObject(url+params+query, MoviesDTO.class);
		
		return movies;
	}
	
	public MoviesDTO getTrendingMovies(int page) {
		String url =  "https://api.themoviedb.org/3/trending/movies/week";
		MoviesDTO movies = restTemplate.getForObject(url+params+"&page="+page, MoviesDTO.class);
		return movies;
	}
	
	
}
