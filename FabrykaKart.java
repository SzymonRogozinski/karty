package com.company;

public class FabrykaKart {

    public Karta[] drukuj(){
        int i,j;
        Karta[] Talia=new Karta[13*4+2];
        //Karta startowa, aby mógł czytać
        Talia[0]=new Karta("Pik","As");
        //Kolory
        for(i=0;i<4;i++){
            //Wartości
            for(j=0;j<13;j++){
                Talia[i*13+j]=new Karta(Talia[0].lista_kolorow[i],Talia[0].lista_wartosci[j]);
            }
        }
        //Jokery
        Talia[52]=new Karta("Czarny","Joker");
        Talia[53]=new Karta("Czerwony","Joker");
        return Talia;
    }

    public Karta[] drukujBezJokerow(){
        int i,j;
        Karta[] Talia=new Karta[13*4];
        //Karta startowa, aby mógł czytać
        Talia[0]=new Karta("Pik","As");
        //Kolory
        for(i=0;i<4;i++){
            //Wartości
            for(j=0;j<13;j++){
                Talia[i*13+j]=new Karta(Talia[0].lista_kolorow[i],Talia[0].lista_wartosci[j]);
            }
        }
        return Talia;
    }
}
