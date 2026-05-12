package HybridInheritance;

public class Main_Vehicle {

    public static void main(String[] args) {

        Bike obj = new Bike();
        obj.Start();
        obj.Ride();

        SportsCar obj1 = new SportsCar();
        obj1.Start();
        obj1.Drive();
        obj1.Fast();
    }
}
