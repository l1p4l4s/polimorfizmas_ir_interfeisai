package com.company.pdf_23_interfacas.uzduotis_1;

import com.company.pdf_23_interfacas.uzduotis_2.PoliceCar;

public class Main {
    public static void main(String arg[]) {

        Jeep jeep = new Jeep(4, 80, 5, "JeepJeep");
        Frigate frigate = new Frigate(100, 50, 40, "Elyze");
        Hovercraft hovercraft = new Hovercraft(4, 100, 10, 60, "HoverHover");
        PoliceCar policeCar[] = new PoliceCar[3];
        policeCar[0] = new PoliceCar(4, 80, 5, "Car0");
        policeCar[1] = new PoliceCar(4, 80, 5, "Car1");
        policeCar[2] = new PoliceCar(4, 80, 5, "Car2");
        System.out.println(policeCar[1].soundSiren());

    }

}
