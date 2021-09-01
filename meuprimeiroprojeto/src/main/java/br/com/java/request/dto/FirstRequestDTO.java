package br.com.java.request.dto;

import java.io.Serializable;

public class FirstRequestDTO implements Serializable{

	private static final long serialVersionUID = -3249213067052274816L;
	private String phrase;

	public String getPhrase() {
		return phrase;
	}

	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}
	

}
