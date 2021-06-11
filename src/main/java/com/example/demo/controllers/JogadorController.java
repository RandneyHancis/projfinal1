package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.JogadorService;

@RestController
@RequestMapping(value="/carta")

public class JogadorController {
	@Autowired 
	private JogadorService jogadorService;
	
	@GetMapping (value="/idjogador")
	public ResponseEntity <String> jogadorid(){
		String id = jogadorService.idjogador();
		
		return ResponseEntity.ok(id); 
	}
}
