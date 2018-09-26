package com.example.nationalExpress.backend;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dto.TvDTO;
import dto.TvShowsDTO;

@Service("TvService")
public class TvService {
	

		private RestTemplate restTemplate = new RestTemplate();
		private String params= "?language=en-US&api_key=b51f316aae8c57c38fa870244f77731f";

		public TvService() {
			
		}
		
		public TvDTO getTvShow(int id) {
			String url =  "https://api.themoviedb.org/3/tv/";
			
			
			TvDTO movie = restTemplate.getForObject(url+id+params, TvDTO.class);
			return movie;
		}

		public List<TvDTO> getTvShows(String searchText) {
			String url =  "https://api.themoviedb.org/3/search/tv";
			String query = "&query=" + searchText;
			System.out.println(url+params+query);
			TvShowsDTO tvShows = restTemplate.getForObject(url+params+query, TvShowsDTO.class);
			
			return tvShows.getTvShows();
		}
		
		public TvShowsDTO getTrendingTv(int page ) {
			String url =  "https://api.themoviedb.org/3/trending/tv/week";
			
			TvShowsDTO tvShows = restTemplate.getForObject(url+params+ "&page=" +page, TvShowsDTO.class);
			
			return tvShows;
		}
	}
