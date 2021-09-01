package br.com.java.response.dto;

import java.io.Serializable;

public class TesteResponseDTO implements Serializable {

	private static final long serialVersionUID = 4873647042448161002L;
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}