package com.curso.pontointeligente.api.security.dto;

public class TokenDto {

	private String token;

	public TokenDto() {
	}

	public TokenDto(String token) {
		setToken(token);
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
