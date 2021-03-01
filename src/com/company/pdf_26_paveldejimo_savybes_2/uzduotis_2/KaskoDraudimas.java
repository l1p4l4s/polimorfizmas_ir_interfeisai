package com.company.pdf_26_paveldejimo_savybes_2.uzduotis_2;

class KaskoDraudimas extends AutomobilioDraudimas {
    private double fransize;

    public KaskoDraudimas(String apdraustojoVardas, double draudimoSuma,
                          String automobilioValstNr, double fransize) {
        super(apdraustojoVardas, draudimoSuma, automobilioValstNr);
        this.fransize = fransize;
    }

    public double getFransize() {
        return fransize;
    }

    public void setFransize(double fransize) {
        this.fransize = fransize;
    }
}
