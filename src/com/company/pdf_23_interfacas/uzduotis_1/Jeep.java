package com.company.pdf_23_interfacas.uzduotis_1;

public class Jeep implements isLandVehicle{


    private int numWheels, maxSpeed, maxPassengers;
    private String name;

    Jeep(int numWheels, int maxSpeed, int maxPassengers, String name ){
        this.numWheels = numWheels;
        this.maxSpeed = maxSpeed;
        this.maxPassengers = maxPassengers;
        this.name = name;

    }

    String soundHorn(){
        return "Jeep beeper sound";
    }

    @Override
    public int getNumWheels() {
        return this.numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public String drive() {
        return "Jeep is driving";
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
