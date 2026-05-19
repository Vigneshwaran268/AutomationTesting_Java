package Abstraction;

abstract class Vehicle {

    abstract void start();
    abstract void stop();

    void fuelType(){
        System.out.println("Fuel Type is Diesel");
    }
}

class Innova extends Vehicle{
    void start(){
        System.out.println("Innova starts...");
    }

    void stop(){
        System.out.println("Innova stops...");
    }

}

class Bolero extends Vehicle{
    void start(){
        System.out.println("Bolero starts...");
    }

    void stop(){
        System.out.println("Bolero stops...");
    }

}

class MainClass{
    public static void main(String[] args) {
        Vehicle obj;
        System.out.println("Innova");
        obj = new Innova();
        obj.start();
        obj.stop();
        obj.fuelType();
        System.out.println("----------------------------------------------");
        System.out.println("Bolero");
        obj = new Bolero();
        obj.start();
        obj.stop();
        obj.fuelType();
    }
}
