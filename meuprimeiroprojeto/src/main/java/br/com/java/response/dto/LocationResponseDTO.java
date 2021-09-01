package br.com.java.response.dto;


public class LocationResponseDTO {
private static final long serialVersionUID = -3249213067052274811L;


private String cep;
private String road;
private String owner;

public LocationResponseDTO() {
	
}


public LocationResponseDTO(String cep, String road, String owner) {
	this.cep = cep;
	this.road = road;
	this.owner = owner;
}

public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}
public String getRoad() {
	return road;
}
public void setRoad(String road) {
	this.road = road;
}

















}