package br.com.java.response.dto;

import java.io.Serializable;
import java.util.ArrayList;

public class FirstResponseDTO implements Serializable {
private static final long serialVersionUID = 4873647042448161003L;
	
	public FirstResponseDTO() {
		
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
