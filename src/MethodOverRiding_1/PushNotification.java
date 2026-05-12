package MethodOverRiding_1;

public class PushNotification extends Notification{

    @Override
    public void send() {
        System.out.println("Notification send through push notification");
    }
}
