package com.company;

import java.util.Arrays;
import java.util.Random;

public class MieszaniePartiami implements Tasowanie{
    public void tasowanie(Karta[] Talia) {
        Random R=new Random();
        int r=R.nextInt(5,20);
        int start,end,range;
        Karta[] Part;
        while(r-->0){
            range=Talia.length/2;
            start=R.nextInt(0, range);
            end=R.nextInt(range,Talia.length);
            Part= Arrays.copyOf(Talia,start);
            for(int i=0;i<end-start;i++){
                Talia[i]=Talia[i+start];
            }
            for(int i=0;i<start;i++){
                Talia[i+end-start]=Part[i];
            }
        }
    }
}
