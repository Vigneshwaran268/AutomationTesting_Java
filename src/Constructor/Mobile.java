package Constructor;

public class Mobile {

    String brand;
    String model;
    int price;

    Mobile(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public static void main(String[] args) {
        Mobile obj = new Mobile("SAMSUNG", "S25", 100000);
        Mobile obj1 = new Mobile("APPLE", "Iphone 14", 80000);
        Mobile obj2 = new Mobile("Redmi", "K20", 25000);
        Mobile obj3 = new Mobile("Vivo", "Y25", 1500);

        System.out.println("==============================================================");
        System.out.println("Brand\t\t\tModel\t\t\tPrice\t\t\t");
        System.out.println("==============================================================");
        System.out.println(obj.brand+"\t\t\t"+obj.model+"\t\t\t"+obj.price);
        System.out.println(obj1.brand+"\t\t\t"+obj1.model+"\t\t\t"+obj1.price);
        System.out.println(obj2.brand+"\t\t\t"+obj2.model+"\t\t\t"+obj2.price);
        System.out.println(obj3.brand+"\t\t\t"+obj3.model+"\t\t\t"+obj3.price);
    }
}
