package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.JogadorDTO;
import com.example.demo.services.PontoService;

@RestController
@RequestMapping(value="/carta")
public class PontoController {
	@Autowired
	private PontoService pontoService;
	@GetMapping(value="/JogadorInfo")
	public ResponseEntity<JogadorDTO> jogadorInfo(){
		JogadorDTO info = pontoService.PontoInicial();
		return ResponseEntity.ok(info);
	}

}
