package com.company.pdf_26_paveldejimo_savybes_2.uzduotis_3;

public class Info {

    private int id;
    private String tekstas;

    public Info(int id, String tekstas) {
        this.id = id;
        this.tekstas = tekstas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTekstas() {
        return tekstas;
    }

    public void setTekstas(String tekstas) {
        this.tekstas = tekstas;
    }

    boolean arYraTekste(String zodis){
        boolean arRastas = this.tekstas.contains(zodis);
        return arRastas;
    }

    @Override
    public String toString(){
        return "id: " + this.id + ", tekstas: " + this.tekstas;
    }
}
