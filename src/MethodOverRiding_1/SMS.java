package MethodOverRiding_1;

public class SMS extends Notification{

    @Override
    public void send() {
        System.out.println("Notification send through SMS");
    }
}
