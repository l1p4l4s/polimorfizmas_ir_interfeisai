package com.company.pdf_24_paveldejimo_savybes.uzduotis_1;

public class TeigiamasSkaicius extends Skaiciai{

    @Override
    public void generuok() {
        for (int i = 0; i < super.skaiciuMasyvas.length; i++){
            super.skaiciuMasyvas[i] = i;
        }
    }
}
