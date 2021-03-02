package com.company.additional_inheritance_and_interface_exercises.workers;

public class Main {

    public static void main(String[] arg){
        Worker projectManager = new Manager("A", OccupationTypes.PROJECT_MANAGER);
        Worker juniorDeveloper = new Developer("B", OccupationTypes.JUNIOR_DEVELOPER);
        Worker midDeveloper = new Developer("C", OccupationTypes.MID_DEVELOPER);
        Worker seniorDeveloper = new Developer("D", OccupationTypes.SENIOR_DEVELOPER);

        projectManager.sendCompliment(juniorDeveloper);
        midDeveloper.sendCompliment(seniorDeveloper);
        seniorDeveloper.sendCompliment(projectManager);
        System.out.println(seniorDeveloper.receivedCompliments);
        System.out.println(juniorDeveloper.receivedCompliments);
        System.out.println(Worker.getAllReceivedWorkerCompliments());
        System.out.println(Manager.getNumberOfAllComplimentsReceived());
        System.out.println(Developer.getNumberOfAllComplimentsReceived());

    }
}
