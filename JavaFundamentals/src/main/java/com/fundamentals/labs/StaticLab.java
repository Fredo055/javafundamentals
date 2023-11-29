package com.fundamentals.labs;

public class StaticLab {

     static double
    calculateResistance(double voltage,double current) {
        return voltage / current;
    }
     static double
     calculateVoltage(double current, double resistance) {
        return current * resistance;
    }
     static double
    calculateCurrent(double voltage, double resistance) {
        return voltage/resistance;
    }

    public static void main(String[] args) {
        System.out.println(StaticLab.calculateVoltage(13.0, 40.0));
        System.out.println(StaticLab.calculateResistance(440.0, 13.0));
        System.out.println(StaticLab.calculateCurrent(250.0, 56.0));
    }



}
