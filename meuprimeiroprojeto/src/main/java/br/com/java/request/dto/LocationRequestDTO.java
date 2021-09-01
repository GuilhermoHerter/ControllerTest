package br.com.java.request.dto;

public class LocationRequestDTO {
	
	private static final long serialVersionUID = -3249213067052274812L;
	
	private String cep;
	private String road;
	private String owner;
	
	public LocationRequestDTO() {
		
	}
	
	public LocationRequestDTO(String cep, String road, String owner) {
		super();
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
