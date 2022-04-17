package com.company;

public class FabrykaKart {

    public Karta[] drukuj(){
        int i,j;
        Karta[] K=new Karta[13*4+2];
        //Karta startowa, aby mógł czytać
        K[0]=new Karta("Pik","As");
        //Kolory
        for(i=0;i<4;i++){
            //Wartości
            for(j=0;j<13;j++){
                K[i*13+j]=new Karta(K[0].lista_kolorow[i],K[0].lista_wartosci[j]);
            }
        }
        //Jokery
        K[52]=new Karta("Czarny","Joker");
        K[53]=new Karta("Czerwony","Joker");
        return K;
    }
}
