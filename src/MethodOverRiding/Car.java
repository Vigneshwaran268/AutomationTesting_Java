package MethodOverRiding;

public class Car extends Vehicle{

    @Override
    public void run(){
        System.out.println("Car drives fast");
    }
}
