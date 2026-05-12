package MethodOverRiding_1;

public class Main_NotificationSystem {

    public static void main(String[] args) {
        Notification obj;

        obj = new Email();
        obj.send();

        obj = new SMS();
        obj.send();

        obj = new PushNotification();
        obj.send();
    }
}
