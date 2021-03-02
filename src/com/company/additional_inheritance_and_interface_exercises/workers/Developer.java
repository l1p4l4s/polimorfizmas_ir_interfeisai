package com.company.additional_inheritance_and_interface_exercises.workers;

public class Developer extends Worker{

    private static int numberOfComplimentsDevelopersReceived = 0;


    public Developer(String name, OccupationTypes occupationType) {
        super(name, occupationType);
    }

    static public int getNumberOfAllComplimentsReceived() {
        return numberOfComplimentsDevelopersReceived;
    }

    @Override
    public void receiveCompliment() {
        this.receivedCompliments++;
        Developer.numberOfComplimentsDevelopersReceived++;
    }

}
