package com.example.nationalExpress.backend;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dto.Greeting;
import dto.MovieDTO;
import dto.MoviesDTO;
import dto.TvDTO;
import dto.TvShowsDTO;
import dto.Rtoken;
import dto.SessionDetails;
import dto.Token;

@RestController
public class GreetingController {
	
	@Autowired
	MovieService movieService;
	
	@Autowired
	TvService tvService;
	
	@Autowired
	AuthService authService;
	

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value= "/movie/{id}")
    public MovieDTO getMovieById(@PathVariable(value="id") int id) {
        MovieDTO movie = this.movieService.getMovie(id);
    	return movie;
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value= "/movies/{searchText}/{page}")
    public MoviesDTO getMovies(@PathVariable(value= "searchText") String searchText, @PathVariable("page") int page) {
    	MoviesDTO movies = this.movieService.getMovies(searchText, page);
    	return movies;
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value= "/movies/trending/{page}")
    public MoviesDTO getTrendingMovies( @PathVariable("page") int page) {
    	MoviesDTO movies = this.movieService.getTrendingMovies(page);
    	return movies;
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value= "/tv/{id}")
    public TvDTO getTvById(@PathVariable(value="id") int id) {
    	TvDTO tvShow = this.tvService.getTvShow(id);
    	return tvShow;
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value= "/tvshows/{searchText}")
    public List<TvDTO> getTvShows(@PathVariable(value= "searchText") String searchText) {
        List<TvDTO> tvShows = this.tvService.getTvShows(searchText);
    	return tvShows;
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value= "/tvshows/trending/{page}")
    public TvShowsDTO getTrendingTv(@PathVariable("page") int page) {
        TvShowsDTO tvShows = this.tvService.getTrendingTv(page);
    	return tvShows;
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value= "/auth/rtoken")
    public Token getRtoken() {
        Token rToken = this.authService.getRequestToken();
        return rToken;
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value= "/auth/sessionid/{requestToken}")
    public SessionDetails getSessionId(@PathVariable("requestToken") String requestToken) {
        SessionDetails sDetails = this.authService.getSessionId(requestToken);
        return sDetails;
    }
    
    
    
}