package com.company.pdf_26_paveldejimo_savybes_2.uzduotis_3;

import java.util.HashMap;
import java.util.Map;

public class DuomenuBaze implements Saugykla {


    Map<Integer, Info> hMapas = new HashMap<>();

    @Override
    public void saugotiInfo(Info info) {
        System.out.println("Issaugota i duomenu baze");
        hMapas.put(info.getId(), info);
    }

    @Override
    public Info rastiInfo(int id) {
        System.out.println("Rasta duomenu bazeje pagal id");
        return hMapas.getOrDefault(id, null);
    }

    @Override
    public Info rastiInfo(String zodis) {
        System.out.println("Rasta duomenubazeje pagal zodi");
        for (Info info: hMapas.values()){
            if (info.arYraTekste(zodis)){
                return info;
            }
        }
        return null;
    }
}
