package com.company.pdf_26_paveldejimo_savybes_2.uzduotis_3;

import org.jetbrains.annotations.NotNull;

public class Programa {
    public static void main (String arg[]){
        NutolesDiskas nutolesDiskas = new NutolesDiskas();
        DuomenuBaze duomenuBaze = new DuomenuBaze();
        Info info1 = new Info(1, "Man patinka sausainiai");
        Info info2 = new Info(2, "Man patinka sriuba");
        Info info3 = new Info(3, "Man patinka sokoladiniai sausainiai");
        Info info4 = new Info(4, "Man nepatinka sausainiai");
        saugoti(nutolesDiskas, info1);
        saugoti(nutolesDiskas, info2);
        saugoti(nutolesDiskas, info3);
        saugoti(nutolesDiskas, info4);

        saugoti(duomenuBaze, info1);
        saugoti(duomenuBaze, info2);
        saugoti(duomenuBaze, info3);
        saugoti(duomenuBaze, info4);

        rastiPagalId(nutolesDiskas, 2);
        rastiPagalZodi(nutolesDiskas, "nepatinka");

        rastiPagalId(duomenuBaze, 1);
        rastiPagalZodi(duomenuBaze, "sokoladiniai");

    }
    static void saugoti(@NotNull Saugykla saugykla, Info info){
        saugykla.saugotiInfo(info);
    }

    static void rastiPagalId(@NotNull Saugykla saugykla, int id){
        System.out.println(saugykla.rastiInfo(id));
    }
    static void rastiPagalZodi(@NotNull Saugykla saugykla, String zodis){
        System.out.println(saugykla.rastiInfo(zodis));
    }

}
