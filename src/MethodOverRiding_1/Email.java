package MethodOverRiding_1;

public class Email extends Notification{

    @Override
    public void send() {
        System.out.println("Notification send through Email");
    }
}
