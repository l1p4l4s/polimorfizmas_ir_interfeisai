package com.company.pdf_26_paveldejimo_savybes_2.uzduotis_2;

public class Draudimas {
    private String apdraustojoVardas;
    private double draudimoSuma;
    public Draudimas(String apdraustojoVardas, double draudimoSuma) {
        this.apdraustojoVardas = apdraustojoVardas;
        this.draudimoSuma = draudimoSuma;
    }

    public String getApdraustojoVardas() {
        return apdraustojoVardas;
    }

    public void setApdraustojoVardas(String apdraustojoVardas) {
        this.apdraustojoVardas = apdraustojoVardas;
    }

    public double getDraudimoSuma() {
        return draudimoSuma;
    }

    public void setDraudimoSuma(double draudimoSuma) {
        this.draudimoSuma = draudimoSuma;
    }
}
