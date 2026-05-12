package MethodOverRiding_1;

public class Bike extends VehicleSystem {

    @Override
    public void start() {
        System.out.println("Bike starts with self start");
    }
}
