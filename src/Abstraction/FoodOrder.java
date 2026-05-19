package Abstraction;

abstract class FoodOrder {
    abstract void prepareFood();
}

class Pizza extends FoodOrder{
    void prepareFood(){
        System.out.println("Pizza Prepared");
    }
}

class Burger extends FoodOrder{
    void prepareFood(){
        System.out.println("Burger Prepared");
    }
}

class MainClass_10{
    public static void main(String[] args) {
        FoodOrder obj;
        obj = new Pizza();
        obj.prepareFood();

        obj = new Burger();
        obj.prepareFood();
    }
}
