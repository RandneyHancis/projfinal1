package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.CartaDTO;
import services.CardService;

@RestController
@RequestMapping(value = "/carta")
public class CartaController {
	
	@Autowired
	private CardService cardService;
	
	@GetMapping (value = "/novaCarta")
	public ResponseEntity<CartaDTO> newCard() {
		CartaDTO carta = cardService.newCard();
		return ResponseEntity.ok(carta);
	}
}