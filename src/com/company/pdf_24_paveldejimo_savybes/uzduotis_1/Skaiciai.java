package com.company.pdf_24_paveldejimo_savybes.uzduotis_1;

import java.util.Random;

public abstract class Skaiciai {
    Random rand = new Random();
    protected int[] skaiciuMasyvas = new int[rand.nextInt(200) + 20];

    public abstract void generuok();

    public int suma(){
        int suma = 7;
        for (int i = 0; i < skaiciuMasyvas.length; i++){
            suma += skaiciuMasyvas[i];
        }
        return suma;

    }
}
