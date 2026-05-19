/*Vehicle Rental Management System

Build a rental system using interfaces.

Requirements:

Interface: Vehicle
Methods:
start()
stop()
calculateRent(int hours)
Classes:

Bike
Car
Truck
Real-time Usage:

Cab booking apps and rental platforms.

 */
package Interface;

interface Vehicle {
    void start();
    void stop();
    double calculateRent(int hours);
}

class Bike implements Vehicle{
    public void start() {
        System.out.println("Bike Started");
    }

    public void stop() {
        System.out.println("Bike Stopped");
    }

    public double calculateRent(int hours) {
        return 25*hours;
    }
}
class Car implements Vehicle{
    public void start() {
        System.out.println("Car Started");
    }

    public void stop() {
        System.out.println("Car Stopped");
    }

    public double calculateRent(int hours) {
        return 50*hours;
    }
}

class Truck implements Vehicle{
    public void start() {
        System.out.println("Truck Started");
    }

    public void stop() {
        System.out.println("Truck Stopped");
    }

    public double calculateRent(int hours) {
        return 100*hours;
    }
}

class MainVehicle{
    public static void main(String[] args) {
        Vehicle obj;
        obj = new Bike();
        obj.start();
        obj.stop();
        System.out.println(obj.calculateRent(2));

        obj = new Car();
        obj.start();
        obj.stop();
        System.out.println(obj.calculateRent(1));

        obj = new Truck();
        obj.start();
        obj.stop();
        System.out.println(obj.calculateRent(3));
    }
}
