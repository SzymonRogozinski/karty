package com.company;

import java.util.Random;

public class LosoweMieszanie implements Tasowanie{
    public void tasowanie(Karta[] Talia) {
        Random R=new Random();
        int r=R.nextInt(50,100);
        int position,next_position;
        while((r--)>0){
            position=R.nextInt(0, Talia.length);
            next_position=R.nextInt(0, Talia.length);
            Karta tmp=Talia[position];
            Talia[position]=Talia[next_position];
            Talia[next_position]=tmp;
        }
    }
}
