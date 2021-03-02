package com.company.exception_uzduotys.uzduotis_3;

import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.List;

public class Monitoring {
    protected void pingAllDevices(List<Device> devices) {
        System.out.println("-----Pinging started-----");
        for (Device device : devices) {
            try {
                System.out.print("Device " + device.getClass().getSimpleName() +
                        " with id: " + device.getId() + " is ");
                device.ping();
                System.out.print("ON");
            } catch (DeviceIsOffException e) {
                System.out.print("OFF");
            }
            System.out.println();
        }
        System.out.println("-----Pinging finished----");
    }
}
