package com.company;

import java.util.*;

public class Karta implements Comparable <Karta> {
    final String[] lista_wartosci ={"Dwójka","Trójka","Czwórka","Piątka","Szóstka","Siódemka",
            "Ósemka","Dziewiątka","Dziesiątka","Jopek","Królowa","Król","As","Joker"}; //Tablica sotępny wartości
    //Plus dwa kolory dla jokera Czarny i Czerwony
    final String[] lista_kolorow={"Pik","Kier","Karo","Trefl"}; //Tablica dostępnych kolorów
    final private String kolor;
    final private String wartosc;

    public Karta(String kolor, int waga) {
        if(waga<0 ||waga >= lista_wartosci.length)
            throw new ArrayIndexOutOfBoundsException("Nie ma takiej wagi!");
        if(waga==13){
            if(!kolor.equals("Czarny") && !kolor.equals("Czerwony"))
                throw new IllegalArgumentException("Joker przyjmuje tylko kolory Czarny i Czerwony");
        }else
            if(!Arrays.asList(lista_kolorow).contains(kolor))
                throw new IllegalArgumentException("Nie ma takiego koloru!");
        this.kolor = kolor;
        this.wartosc = lista_wartosci[waga];
    }

    public Karta(String kolor, String wartosc) {
        if(!Arrays.asList(lista_wartosci).contains(wartosc))
            throw new IllegalArgumentException("Nie ma takiej karty!");
        if(wartosc.equals("Joker")){
            if(!kolor.equals("Czarny") && !kolor.equals("Czerwony"))
                throw new IllegalArgumentException("Joker przyjmuje tylko kolory Czarny i Czerwony");
        }else
            if(!Arrays.asList(lista_kolorow).contains(kolor))
                throw new IllegalArgumentException("Nie ma takiego koloru!");
        this.kolor = kolor;
        this.wartosc = wartosc;
    }

    public String getKolor() {
        return kolor;
    }

    public String getWartosc() {
        return wartosc;
    }

    //Przekształca wartość karty na liczbę
    public int getWaga(){
        for(int i=0;i<lista_wartosci.length;i++)
            if(lista_wartosci[i].equals(wartosc))
                return i;
        throw new ArrayIndexOutOfBoundsException("Nie odnaleziono wagi!");
    }

    //Przekształca wartość Koloru na liczbę
    public int getWagaKolor(){
        for(int i=0;i<lista_kolorow.length;i++)
            if(lista_kolorow[i].equals(kolor))
                return i;
        throw new ArrayIndexOutOfBoundsException("Nie odnaleziono koloru!");
    }

    @Override
    public String toString() {
        return wartosc + " " + kolor;
    }

    @Override
    public int compareTo(Karta k){
        int r= this.getWaga()-k.getWaga();
        if(r==0){
            if(this.wartosc.equals("Joker")){
                return kolor.equals("Czarny") ? 1:0;
            }else
                return this.getWagaKolor()-k.getWagaKolor();
        }
        return r;
    }
}
