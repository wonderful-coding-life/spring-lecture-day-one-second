package com.example.demo;

public class HanbitTester {
    private HanbitAppliance appliance;

    public void setAppliance(HanbitAppliance appliance) {
        this.appliance = appliance;
    }

    public void test() {
        for (int i = 0; i < 5; i++) {
            appliance.powerOn();
            appliance.powerOff();
        }
    }
}
