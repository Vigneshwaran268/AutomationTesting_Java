package Encapsulation;

public class Tab {

    private String tab_Brand;
    private String tab_Model;
    private double tab_Price;

    public void setter(String brand, String model, double price){
        tab_Brand = brand;
        tab_Model = model;
        tab_Price = price;
    }

    public String getBrand(){
        return tab_Brand;
    }

    public String getModel(){
        return tab_Model;
    }

    public double getPrice(){
        return tab_Price;
    }


}

class TabMain{
    public static void main(String[] args) {
        Tab obj = new Tab();
        obj.setter("Oneplus", "Lite", 19999);
        System.out.println(obj.getBrand());
        System.out.println(obj.getModel());
        System.out.println(obj.getPrice());
    }
}
