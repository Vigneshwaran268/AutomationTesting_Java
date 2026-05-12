package MethodOverRiding_1;

public class Main_TransportSystem {

    public static void main(String[] args) {
        Transport obj;

        obj = new Bus_1();
        obj.travelTime();

        obj = new Train_1();
        obj.travelTime();

        obj = new Flight_1();
        obj.travelTime();
    }
}
