package Encapsulation;

public class Mobile {
    private String Mobile_brand;
    private String Mobile_model;
    private int Mobile_price;

    public void getter(String brand, String model, int price){
        Mobile_brand = brand;
        Mobile_model = model;
        Mobile_price = price;
    }

    public String setBrand(){
        return Mobile_brand;
    }
    public String setModel(){
        return Mobile_brand;
    }
    public int setPrice(){
        return Mobile_price;
    }
}

class MainClass_6{
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.getter("Apple", "Iphone 14", 75000);
        System.out.println("Mobile Brand: "+obj.setBrand());
        System.out.println("Mobile Model: "+obj.setModel());
        System.out.println("Mobile Price: "+obj.setPrice());
    }
}
