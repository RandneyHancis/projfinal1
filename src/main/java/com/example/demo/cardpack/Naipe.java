package com.example.demo.cardpack;

/**
*
* @author Demerson, Paulo, Randney
*/
public enum Naipe {
   COPAS ("copas", "N1"), ESPADA ("espada", "N2"), OURO ("ouro", "N3"), PAUS ("paus", "N4");
   
   private final String naipes;
   private final String codigoNaipe;

   private Naipe(String naipes, String codigo) {
       this.naipes = naipes;
       this.codigoNaipe = codigo;
   }

   public String getNaipes() {
       return naipes;
   }    

   public String getCodigoNaipe() {
       return codigoNaipe;
   }
}
