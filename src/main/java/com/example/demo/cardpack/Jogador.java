package com.example.demo.cardpack;

import javax.swing.JLabel;

/**
*
* @author Demerson, Paulo, Randney
*/
public class Jogador {
   private final int cartasNoJogo = 5;
   private final String nomeJogador;
   private CartaBaralho[] mao = CartaBaralho.geraBaralho();
   private int pontos;
   private int idJogador;

   public Jogador(String nomeJogador, CartaBaralho[] mao, int pontos) {
       this.nomeJogador = nomeJogador;
       this.mao = CartaBaralho.geraBaralho();
       this.pontos = 0;
   }

   public int getCartasNoJogo() {
       return cartasNoJogo;
   }

   public String getNomeJogador() {
       return nomeJogador;
   }

   public CartaBaralho[] getMao() {
       return mao;
   }    

   public int getPontos() {
       return pontos;
   }
         
   public int soma(int i, int j, Jogador maoJogador, Jogador maoCasa, int soma, JLabel pontos) {
       soma += maoJogador.getMao()[j].getCarta().getPontos() + maoCasa.getMao()[i].getCarta().getPontos();            
       pontos.setText(Integer.toString(soma));        
       return soma;
   }

   public int getIdJogador() {
	   return idJogador;
   }

   public void setIdJogador(int idJogador) {
	   this.idJogador = idJogador;
   }
   
}
