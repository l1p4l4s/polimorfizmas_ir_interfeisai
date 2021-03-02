package com.company.exception_uzduotys.uzduotis_3;

public class Device {
    private boolean isOn;
    private static int idStatic = 0;
    private int id;

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getId() {
        return id;
    }

    public Device(boolean isOn) {
        this.isOn = isOn;
        this.id = idStatic;
        idStatic++;

    }

    protected void ping() throws DeviceIsOffException {
        if (!isOn) {
            throw new DeviceIsOffException();
        }
    }


}
