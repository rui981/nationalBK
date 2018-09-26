package com.example.nationalExpress.backend;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dto.SessionDetails;
import dto.Token;
import dto.Rtoken;

@Service("AuthService")
public class AuthService {
	private RestTemplate restTemplate = new RestTemplate();
	
	public Token getRequestToken() {
			
		String url = "https://api.themoviedb.org/3/authentication/token/new?api_key=b51f316aae8c57c38fa870244f77731f";
		Token tokenDetails = restTemplate.getForObject(url, Token.class);
		return tokenDetails;
	}
	
	public SessionDetails  getSessionId(String requestToken) {
		String url = "https://api.themoviedb.org/3/authentication/session/new?api_key=b51f316aae8c57c38fa870244f77731f";
		SessionDetails  sessionDetails = restTemplate.postForObject(url, new Rtoken(requestToken), SessionDetails.class);
		return sessionDetails;
	}
	
}
