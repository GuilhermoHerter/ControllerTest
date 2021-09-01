package br.com.java.controllers;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.java.request.dto.LocationRequestDTO;
import br.com.java.response.dto.LocationResponseDTO;

@RestController
@RequestMapping("location")
public class LocationController {

	LocationResponseDTO locationOne = new LocationResponseDTO();
	ArrayList<LocationResponseDTO> list = new ArrayList<>();

	@PostMapping("create")
	public ResponseEntity<?> get(@RequestBody LocationRequestDTO request) {

		locationOne.setOwner("Owner: " + request.getOwner());
		locationOne.setCep("Cep: " + request.getCep());
		locationOne.setRoad("Road:" + request.getRoad());
		list.add(locationOne);
		return ResponseEntity.status(HttpStatus.OK).body("sucess");
	}

	@GetMapping("get")
	public String showLocation() {
		return locationOne.getCep() + "  " + locationOne.getOwner() + "  " + locationOne.getRoad();

	}

	@PutMapping("update")
	public ResponseEntity<?> updateNewComputer() {
		return ResponseEntity.status(HttpStatus.CONTINUE).body("Already updated!");
	}

}
