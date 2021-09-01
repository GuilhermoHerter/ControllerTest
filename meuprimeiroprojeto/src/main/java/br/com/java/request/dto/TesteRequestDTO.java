package br.com.java.request.dto;

import java.io.Serializable;

public class TesteRequestDTO implements Serializable {

	private static final long serialVersionUID = -3249213067052274817L;
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}