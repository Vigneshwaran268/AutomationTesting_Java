package Abstraction;

abstract class Appliance {
    abstract void turnOn();
}

class Fan extends Appliance{
    void turnOn(){
        System.out.println("Fan turned on");
    }
}

class WashingMachine extends Appliance{
    void turnOn(){
        System.out.println("Washing Machine turned on");
    }
}

class MainClass_7{
    public static void main(String[] args) {
        Appliance obj;
        obj = new Fan();
        obj.turnOn();

        obj = new WashingMachine();
        obj.turnOn();
    }
}
