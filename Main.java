package com.company;

public class Main {

    public static void main(String[] args) {
	    FabrykaKart f=new FabrykaKart();
        Tasowanie S=new MieszaniePartiami();
        Karta[] k=f.drukujBezJokerow();
        S.tasowanie(k);
        for(Karta d :k)
            System.out.println(d);
    }
}
