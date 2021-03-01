package com.company.pdf_26_paveldejimo_savybes_2.uzduotis_3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NutolesDiskas implements Saugykla {

    ArrayList<Info> arrayListas = new ArrayList<>();

    @Override
    public void saugotiInfo(Info info) {
        System.out.println("Issaugotai nutolusi diska");
        arrayListas.add(info);

    }

    @Override
    public Info rastiInfo(int id) {
        for (Info info : arrayListas) {
            if (info.getId() == id) {
                System.out.println("Rasta nutolusiame diske pagal id");
                return info;
            }
        }
        System.out.println("Nutolusiame diske Info objektas nerastas");
        return null;
    }

    @Override
    public Info rastiInfo(String zodis) {
        for (Info info : arrayListas) {
            if (info.arYraTekste(zodis)) {
                System.out.println("Rasta nutolusiame diske pagal zodi");
                return info;
            }
        }
        System.out.println("Nerasta nutolusiame diske pagal zodi");
        return null;
    }
}
