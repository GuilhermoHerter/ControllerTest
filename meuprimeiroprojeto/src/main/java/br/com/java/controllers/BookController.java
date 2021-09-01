package br.com.java.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.java.request.dto.TesteRequestDTO;
import br.com.java.response.dto.TesteResponseDTO;


@RestController
@RequestMapping("book")
public class BookController {

	@PostMapping("teste")
	public ResponseEntity<?> teste(@RequestBody final TesteRequestDTO request) {
		final TesteResponseDTO response = new TesteResponseDTO();
		response.setMessage("Seu nome é: "+ request.getNome());
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@GetMapping("show")
	public ResponseEntity<?> showBooks() {
		return ResponseEntity.status(HttpStatus.OK).body("Mostrar livros");
	}
	
	@PostMapping("create")
	public ResponseEntity<?> create() {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Criado");
	}
	
	@PutMapping("update")
	public ResponseEntity<?> updateBook() {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Atualizar");
	}
	
	
	

}
