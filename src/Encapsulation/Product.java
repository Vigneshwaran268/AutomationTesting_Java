package Encapsulation;

public class Product {

    private int product_Id;
    private String product_Name;
    private double product_Price;

    public void setter(int id, String name, double price){
        product_Id = id;
        product_Name = name;

        if(product_Price>=0){
            product_Price = price;
        }
        else {
            System.out.println("Invalid Product Price");
        }
    }

    public int getId(){
        return product_Id;
    }

    public String getName(){
        return product_Name;
    }

    public double getPrice(){
        return product_Price;
    }
}

class MainClass_10{
    public static void main(String[] args) {
        Product obj = new Product();
        obj.setter(32, "Laptop", 35000);
        System.out.println("Product Id: "+obj.getId());
        System.out.println("Product Name: "+obj.getName());
        System.out.println("Product Price: "+obj.getPrice());
    }
}
