package com.initialization;

public class Flower {
    int petalCount=0;
    String s="initial value";

    Flower(int petals){
        this.petalCount=petals;
    }

    Flower(String ss){
        this.s=ss;
    }
     Flower(String s,int petais){
        this(s);
        this.petalCount=petais;
     }

    Flower(){
        this("hi",47);

    }
}
