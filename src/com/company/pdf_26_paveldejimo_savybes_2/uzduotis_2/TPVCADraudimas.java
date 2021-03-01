package com.company.pdf_26_paveldejimo_savybes_2.uzduotis_2;

class TPVCADraudimas extends AutomobilioDraudimas {
    private String galiojimoTeritorija;

    public TPVCADraudimas(String apdraustojoVardas, double draudimoSuma,
                          String automobilioValstNr, String galiojimoTeritorija) {
        super(apdraustojoVardas, draudimoSuma, automobilioValstNr);
        this.galiojimoTeritorija = galiojimoTeritorija;
    }

    public String getGaliojimoTeritorija() {
        return galiojimoTeritorija;
    }

    public void setGaliojimoTeritorija(String galiojimoTeritorija) {
        this.galiojimoTeritorija = galiojimoTeritorija;
    }
}