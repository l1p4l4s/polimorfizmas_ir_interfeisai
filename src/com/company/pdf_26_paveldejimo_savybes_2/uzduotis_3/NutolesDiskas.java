package com.company.pdf_26_paveldejimo_savybes_2.uzduotis_3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NutolesDiskas implements Saugykla {

    ArrayList<Info> arrayListas = new ArrayList<>();

    @Override
    public void saugotiInfo(Info info) {
        arrayListas.add(info);

    }

    @Override
    public Info rastiInfo(int id) {
        for (Info info : arrayListas) {
            if (info.getId() == id) {
                return info;
            }
        }
        return null;
    }

    @Override
    public Info rastiInfo(String zodis) {
        for (Info info : arrayListas) {
            if (info.arYraTekste(zodis)) {
                return info;
            }
        }
        return null;
    }
}
