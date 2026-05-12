package MethodOverRiding_1;

public class Main_VehicleSystem {

    public static void main(String[] args) {
        VehicleSystem obj;
        obj = new Car();
        obj.start();

        obj = new Bike();
        obj.start();

        obj = new Bus();
        obj.start();
    }
}
