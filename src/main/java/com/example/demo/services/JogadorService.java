package com.example.demo.services;

import java.util.UUID;
import org.springframework.stereotype.Service;

import com.example.demo.cardpack.Jogador;

@Service

public class JogadorService {
	public String idjogador() {
		
		String jogadorid = UUID.randomUUID().toString();
		return jogadorid; 
	}
}
