package com.company.pdf_24_paveldejimo_savybes.uzduotis_1;

public class Main {

    public static void main(String arg[]){
        TeigiamasSkaicius teigiamasSkaicius = new TeigiamasSkaicius();
        NeigiamiSkaiciai neigiamiSkaiciai = new NeigiamiSkaiciai();
        LyginisSkaicius lyginisSkaicius = new LyginisSkaicius();
        NelyginisSkaicius nelyginisSkaicius = new NelyginisSkaicius();

        System.out.println(run(teigiamasSkaicius));
        System.out.println(run(neigiamiSkaiciai));
        System.out.println(run(nelyginisSkaicius));
        System.out.println(run(lyginisSkaicius));
    }

    static int run(Skaiciai masyvas){
        masyvas.generuok();
        int suma = 0;
        for (int i = 0; i < masyvas.skaiciuMasyvas.length; i++){
            suma += masyvas.skaiciuMasyvas[i];
        }
        return masyvas.suma();
    }
}
