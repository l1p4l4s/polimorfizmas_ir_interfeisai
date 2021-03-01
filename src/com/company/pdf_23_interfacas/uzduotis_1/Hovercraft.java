package com.company.pdf_23_interfacas.uzduotis_1;

public class Hovercraft implements isLandVehicle, isSeaVessel{

    private int numWheels, displacement, maxPassengers, maxSpeed;
    private String name;

    public Hovercraft(int numWheels, int displacement, int maxPassengers, int maxSpeed, String name) {
        this.numWheels = numWheels;
        this.displacement = displacement;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.name = name;
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
        return "HoverCraft is being driven";
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
        return "Hover craft was launched";
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
