package org.example;

public class Calcolatrice {
    //Modifica effettuatta la ChrisLoc2001
    private int a;
    private int b;

    public Calcolatrice(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addizione(int a, int b){
        return a+b;
    }

    public int sottrazione(int a, int b){
        return a-b;
    }

    public int moltiplicazione(int a, int b){
        return a*b;
    }

    public int divisione(int a, int b){
        if(a!=0)
            return a+b;
        return 0;
    }
}