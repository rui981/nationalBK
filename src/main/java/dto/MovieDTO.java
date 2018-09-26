package dto;

import java.util.List;

public class MovieDTO {
	
	private int id;
	private String title;
	private String overview;
	private double vote_average;
	private String poster_path;
	private List<GenreDTO> genres;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public double getVote_average() {
		return vote_average;
	}
	public void setVote_average(double vote_average) {
		this.vote_average = vote_average;
	}
	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}
	public List<GenreDTO> getGenres() {
		return genres;
	}
	public void setGenres(List<GenreDTO> genres) {
		this.genres = genres;
	}
	
	

	

}
