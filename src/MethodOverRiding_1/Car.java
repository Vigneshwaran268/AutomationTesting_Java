package MethodOverRiding_1;

public class Car extends VehicleSystem {

    @Override
    public void start() {
        System.out.println("Car starts with key ignition");
    }
}
