package Abstraction;

abstract class Vehicle_1 {

    abstract void start();
}

class Car extends Vehicle_1{
    void start(){
        System.out.println("Car starts");
    }
}

class Bike extends Vehicle_1{
    void start(){
        System.out.println("Bike starts");
    }
}

class Main_Class{
    public static void main(String[] args) {
        Vehicle_1 obj;
        obj = new Car();
        obj.start();
        obj = new Bike();
        obj.start();
    }
}
