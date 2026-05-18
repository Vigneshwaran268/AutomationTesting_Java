package Encapsulation;

public class Order {

    private int orderId;
    private String customerName;
    private double orderAmount;

    public void setter(int id, String name, double amount){
        orderId = id;
        customerName = name;
        if(amount > 0){
            orderAmount = amount;
        }
        else {
            System.out.println("Invalid Amount");
        }
    }

    public int getId(){
        return orderId;
    }

    public String getName(){
        return customerName;
    }

    public double getAmount(){
        return orderAmount;
    }
}

class MainClass_14{
    public static void main(String[] args) {
        Order obj = new Order();
        obj.setter(17, "Vignesh", 90);
        System.out.println("Order Id: "+obj.getId());
        System.out.println("Customer Name: "+obj.getName());
        System.out.println("Order Amount: "+obj.getAmount());
    }
}
