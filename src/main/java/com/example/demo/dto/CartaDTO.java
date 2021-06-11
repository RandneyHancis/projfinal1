package com.example.demo.dto;

import java.io.Serializable;


public class CartaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nomeCarta;
	private String naipe;
	private String codigoCarta;
	private String codigoNaipe;
	
	public CartaDTO() {
		
	}	
	
	public CartaDTO(String nomeCarta, String naipe, String codigoCarta, String codigoNaipe) {
		this.nomeCarta = nomeCarta;
		this.naipe = naipe;
		this.codigoCarta = codigoCarta;
		this.codigoNaipe = codigoNaipe;
	}

	public String getNomeCarta() {
		return nomeCarta;
	}

	public void setNomeCarta(String nomeCarta) {
		this.nomeCarta = nomeCarta;
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	public String getCodigoCarta() {
		return codigoCarta;
	}

	public void setCodigoCarta(String codigoCarta) {
		this.codigoCarta = codigoCarta;
	}

	public String getCodigoNaipe() {
		return codigoNaipe;
	}

	public void setCodigoNaipe(String codigoNaipe) {
		this.codigoNaipe = codigoNaipe;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
}
