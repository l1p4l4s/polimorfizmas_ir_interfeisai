package com.company.additional_inheritance_and_interface_exercises.workers;

public abstract class Worker implements SendingCompiliments, ReceivingCompliments {
    final private String name;
    final private OccupationTypes occupationType;

    protected int receivedCompliments = 0;
    private static int allReceivedWorkerCompliments = 0;

    public Worker(String name, OccupationTypes occupationType) {
        this.name = name;
        this.occupationType = occupationType;
    }

    static int getAllReceivedWorkerCompliments() {
        return allReceivedWorkerCompliments;
    }

    public String getName() {
        return name;
    }

    public OccupationTypes getOccupationType() {
        return this.occupationType;
    }

    @Override
    public void sendCompliment(Worker worker) {
        worker.receiveCompliment();
        Worker.allReceivedWorkerCompliments++;
    }
}
