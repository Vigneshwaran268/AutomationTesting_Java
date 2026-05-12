package MethodOverloading;

public class TemperatureConvert {

    public void convert(double celsius){
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit);
    }

    public void convert(double fahrenheit, int x){
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(celsius);
    }

    public static void main(String[] args) {
        TemperatureConvert obj = new TemperatureConvert();
        obj.convert(68);
        obj.convert(99,1);
    }
}
