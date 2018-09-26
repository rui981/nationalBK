package dto;

import java.util.ArrayList;
import java.util.List;

public class MoviesDTO {
	
private List<MovieDTO> results;
private  int total_results;
private int total_pages;

public MoviesDTO() {
	results = new ArrayList<>();
}


public void setMovies(List<MovieDTO> movies) {
	this.results = movies;
}

public List<MovieDTO> getResults() {
	return results;
}

public void setResults(List<MovieDTO> results) {
	this.results = results;
}

public int getTotal_results() {
	return total_results;
}

public void setTotal_results(int total_results) {
	this.total_results = total_results;
}

public int getTotal_pages() {
	return total_pages;
}

public void setTotal_pages(int total_pages) {
	this.total_pages = total_pages;
}





}
