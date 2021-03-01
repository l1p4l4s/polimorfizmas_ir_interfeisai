package com.company.pdf_23_interfacas.uzduotis_2;

import com.company.pdf_23_interfacas.uzduotis_1.isLandVehicle;

public class PoliceCar implements isEmergency, isLandVehicle {
    int numWheels, maxPassengers, maxSpeed;
    String name;

    public PoliceCar(int numWheels, int maxPassengers, int maxSpeed, String name) {
        this.numWheels = numWheels;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    @Override
    public String soundSiren() {
        return "EMERGENCY!!!!";
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
        return "Police car is driving";
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
