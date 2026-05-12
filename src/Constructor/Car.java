package Constructor;

public class Car {

    String brand;
    String model;
    double price;
    int manufactureYear;


    Car(String brand, String model, double price, int manufactureYear){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.manufactureYear = manufactureYear;



    }

    public static void main(String[] args) {
        Car obj = new Car("Maruthi Suzuki", "Eeco",  700000, 2010);
        Car obj1 = new Car("Mahindra", "Bolero",  1200000, 2011);
        Car obj2 = new Car("Hyundai", "Creta",  1700000, 2018);
        Car obj3 = new Car("Audi", "A3",  7000000, 2020);
        Car obj4 = new Car("Honda", "Amaze",  1400000, 20021);

        System.out.println("============================================================");
        System.out.println("Brand\t\tModel\t\tPrice\t\tManufacture Year");
        System.out.println("============================================================");
        System.out.println(obj.brand+"\t\t"+obj.model+"\t\t"+obj.price+"\t\t"+obj.manufactureYear);
        System.out.println(obj1.brand+"\t\t"+obj1.model+"\t\t"+obj1.price+"\t\t"+obj1.manufactureYear);
        System.out.println(obj2.brand+"\t\t"+obj2.model+"\t\t"+obj2.price+"\t\t"+obj2.manufactureYear);
        System.out.println(obj3.brand+"\t\t"+obj3.model+"\t\t"+obj3.price+"\t\t"+obj3.manufactureYear);
        System.out.println(obj4.brand+"\t\t"+obj4.model+"\t\t"+obj4.price+"\t\t"+obj4.manufactureYear);
    }
}
