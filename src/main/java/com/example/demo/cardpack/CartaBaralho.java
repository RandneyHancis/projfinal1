/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.cardpack;

import java.security.SecureRandom;

/**
 *
 * @author Demerson, Paulo, Randney
 */
public class CartaBaralho {
    private Cartas carta;
    private Naipe naipe;
    static private String image;    
    private static final SecureRandom randomNumbers = new SecureRandom();
    public static final CartaBaralho[] baralhoInicial = geraBaralho();

    public CartaBaralho(Cartas carta, Naipe naipe, String image) {
        this.carta = carta;
        this.naipe = naipe;
        CartaBaralho.image = image;
    }

    public Cartas getCarta() {
        return carta;
    }

    public Naipe getNaipe() {
        return naipe;
    }
    
    public String getImage() {
        return image;
    }
    
    public static CartaBaralho[] geraBaralho () {
        int tamanhoBaralho = Naipe.values().length * Cartas.values().length;
        CartaBaralho baralho[] = new CartaBaralho[tamanhoBaralho];
        
        int i = 0;
        for(Naipe naipe : Naipe.values()) {            
            for(Cartas carta : Cartas.values()) {
                baralho[i++] = new CartaBaralho(carta, naipe, image);                
            }
        }        
                
        for(int first = 0; first < baralho.length; first++) {
            int second = randomNumbers.nextInt(tamanhoBaralho);
            CartaBaralho aux = baralho[first];
            baralho[first] = baralho[second];
            baralho[second] = aux;
        }
        
        return baralho;
    }
    
}

