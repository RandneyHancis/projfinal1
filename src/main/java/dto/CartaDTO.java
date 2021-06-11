package dto;

import java.io.Serializable;


public class CartaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String cardName;
	private String cardSuit;
	private String codigoNomeCarta;
	private String codigoNaipe;
	
	public CartaDTO() {
		
	}	
	
	public CartaDTO(String cardName, String cardSuit, String codigoNomeCarta, String codigoNaipe) {
		super();
		this.cardName = cardName;
		this.cardSuit = cardSuit;
		this.codigoNomeCarta = codigoNomeCarta;
		this.codigoNaipe = codigoNaipe;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardSuit() {
		return cardSuit;
	}

	public void setCardSuit(String cardSuit) {
		this.cardSuit = cardSuit;
	}

	public String getCodigoNomeCarta() {
		return codigoNomeCarta;
	}

	public void setCodigoNomeCarta(String codigoNomeCarta) {
		this.codigoNomeCarta = codigoNomeCarta;
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
