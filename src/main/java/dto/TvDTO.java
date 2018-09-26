package dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

public class TvDTO {

	private int id;
	private String name;
	private double popularity;
	private double vote_average;
	private String poster_path;
	private String overview;
	private List<GenreDTO> genres;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<SeasonDTO> seasons;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPopularity() {
		return popularity;
	}
	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}
	

	public List<GenreDTO> getGenres() {
		return genres;
	}
	public void setGenres(List<GenreDTO> genres) {
		this.genres = genres;
	}
	public List<SeasonDTO> getSeasons() {
		return seasons;
	}
	public void setSeasons(List<SeasonDTO> seasons) {
		this.seasons = seasons;
	}
	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}
	public double getVote_average() {
		return vote_average;
	}
	public void setVote_average(double vote_average) {
		this.vote_average = vote_average;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	
	
	

}
