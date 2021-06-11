package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.dto.JogadorDTO;

@Service
public class PontoService {
	public JogadorDTO PontoInicial() {
		JogadorDTO ponto = new JogadorDTO();
		return new JogadorDTO(ponto.getCartasNoJogo(),ponto.getNomeJogador(), ponto.getPontos());
	}


}
