package HierarchialInheritance;

public class Main_Vehicle {

    public static void main(String[] args) {

        Car obj = new Car();
        obj.Start();
        obj.Drive();

        Bike obj1 = new Bike();
        obj1.Start();
        obj1.Ride();
    }
}
