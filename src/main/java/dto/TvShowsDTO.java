package dto;

import java.util.ArrayList;
import java.util.List;

public class TvShowsDTO {
	
	private List<TvDTO> results;
	private  int total_results;
	private int total_pages;
	
	public TvShowsDTO() {
	results = new ArrayList<>();
	}

	public List<TvDTO> getResults() {
		return results;
	}

	public void setResults(List<TvDTO> results) {
		this.results = results;
	}

	
	public List<TvDTO> getTvShows() {
		return this.getResults();
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
