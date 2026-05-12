package MethodOverRiding_1;

public class Bus extends VehicleSystem {

    @Override
    public void start() {
        System.out.println("Bus starts with diesel engine");
    }
}
