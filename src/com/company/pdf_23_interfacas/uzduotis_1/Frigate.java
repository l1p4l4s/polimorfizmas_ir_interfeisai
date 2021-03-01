package com.company.pdf_23_interfacas.uzduotis_1;

public class Frigate implements isSeaVessel{

    private int displacement, maxPassengers, maxSpeed;
    private String name;

    public Frigate(int displacement, int maxPassengers, int maxSpeed, String name) {
        this.displacement = displacement;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    public String fireGun(){
        return "Frigate fired a gun";
    }

    @Override
    public int getDisplacement() {
        return this.displacement;
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public String launch() {
        return "Frigate was launched";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxPassengers() {
        return this.maxPassengers;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
