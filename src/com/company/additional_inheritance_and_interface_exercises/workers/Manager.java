package com.company.additional_inheritance_and_interface_exercises.workers;

public class Manager extends Worker {

    private static int numberOfComplimentsManagersReceived = 0;

    public Manager(String name, OccupationTypes occupationType) {
        super(name, occupationType);
    }

    static public int getNumberOfAllComplimentsReceived() {
        return numberOfComplimentsManagersReceived;
    }

    @Override
    public void receiveCompliment() {
        this.receivedCompliments++;
        Manager.numberOfComplimentsManagersReceived++;
    }
}
