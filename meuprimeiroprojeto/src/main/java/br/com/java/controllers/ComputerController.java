package br.com.java.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.java.request.dto.FirstRequestDTO;
import br.com.java.response.dto.FirstResponseDTO;

@RestController
@RequestMapping("computer")
public class ComputerController {

	@GetMapping("get")
	public ResponseEntity<?> showComputers() {
		return ResponseEntity.status(HttpStatus.OK).body("Showing list of computers!");
	}

	@PostMapping("create")
	public ResponseEntity<?> get(@RequestBody final FirstRequestDTO request) {
		final FirstResponseDTO text = new FirstResponseDTO();
		text.setMessage("Your message: " + request.getPhrase());
		return ResponseEntity.status(HttpStatus.OK).body(text);
	}

	@PutMapping("update")
	public ResponseEntity<?> updateNewComputer() {
		return ResponseEntity.status(HttpStatus.CONTINUE).body("Already updated!");
	}

}
