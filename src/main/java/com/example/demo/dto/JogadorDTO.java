package com.example.demo.dto;

import java.io.Serializable;

public class JogadorDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private int cartasNoJogo = 5;
	private final String nomeJogador;
	private int pontos = 0;
	
	public JogadorDTO() {
		this.nomeJogador = "";
		
	}

	public JogadorDTO(int cartasNoJogo, String nomeJogador, int pontos) {
		super();
		this.cartasNoJogo = cartasNoJogo;
		this.nomeJogador = nomeJogador;
		this.pontos = pontos;
	}

	public int getCartasNoJogo() {
		return cartasNoJogo;
	}

	public void setCartasNoJogo(int cartasNoJogo) {
		this.cartasNoJogo = cartasNoJogo;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}
	
}
