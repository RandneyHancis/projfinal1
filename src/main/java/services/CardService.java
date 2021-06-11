package services;

import java.util.Random;

import cardpack.CartaBaralho;
import dto.CartaDTO;

public class CardService {

	private Random random = new Random();
	
	public CartaDTO newCard() {
		int pos = random.nextInt(CartaBaralho.baralhoInicial.length);
		CartaBaralho carta = CartaBaralho.baralhoInicial[pos];
		return new CartaDTO(carta.getCarta().getNomeCarta(), carta.getNaipe().getNaipes(),
				carta.getCarta().getCodigoCarta(), carta.getNaipe().getCodigoNaipe());				
	}
}
