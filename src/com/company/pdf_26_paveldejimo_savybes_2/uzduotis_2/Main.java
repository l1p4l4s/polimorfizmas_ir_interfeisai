package com.company.pdf_26_paveldejimo_savybes_2.uzduotis_2;

public class Main {
    public static void main(String arg[]) {
        Draudimas draudimas = new TPVCADraudimas("Silvestras", 1000, "ABC123", "Lietuva");
        Draudimas draudimas1 = new KaskoDraudimas("Inesa", 2000, "JKS213", 666);

        System.out.println(draudimas.getApdraustojoVardas());
        System.out.println(draudimas.getDraudimoSuma());

        AutomobilioDraudimas automobilioDraudimas = (AutomobilioDraudimas) draudimas;
        System.out.println(automobilioDraudimas.getAutomobilioValstNr());


        TPVCADraudimas tpvcaDraudimas = (TPVCADraudimas) draudimas;
        System.out.println(tpvcaDraudimas.getGaliojimoTeritorija());

        System.out.println(draudimas1.getApdraustojoVardas());
        System.out.println(draudimas1.getDraudimoSuma());

        AutomobilioDraudimas automobilioDraudimas1 = (AutomobilioDraudimas) draudimas1;
        System.out.println(automobilioDraudimas1.getAutomobilioValstNr());

        KaskoDraudimas kaskoDraudimas = (KaskoDraudimas) draudimas1;
        System.out.println(kaskoDraudimas.getFransize());

        AutomobilioDraudimas automobilioDraudimas2 = new AutomobilioDraudimas("Pijus", 123, "QWD431");

        try {
            KaskoDraudimas kaskoDraudimas1 = (KaskoDraudimas) automobilioDraudimas2;
        }
        catch (ClassCastException e){
            System.out.println("Negalima downcastinit automobilioDraudimas2");
        }

    }
}
