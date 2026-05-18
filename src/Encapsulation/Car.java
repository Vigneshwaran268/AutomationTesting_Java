package Encapsulation;

public class Car {

    private String car_Name;
    private String car_Speed;
    private double car_price;

    public void getter(String name, String speed, double price){
        car_Name = name;
        car_Speed = speed;
        car_price = price;
    }

    public String setName(){
        return car_Name;
    }
    public String setSpeed(){
        return car_Speed;
    }
    public double setPrice(){
        return car_price;
    }
}

class MainClass_7{
    public static void main(String[] args) {
        Car obj = new Car();
        obj.getter("Bolero", "100 KMPH", 1500000);
        System.out.println("Car Name: "+obj.setName());
        System.out.println("car Speed: "+obj.setSpeed());
        System.out.println("Car Price: "+obj.setPrice());
    }
}
