package Abstraction;

interface Notification {
    void SendMessage();
}

class EmailNotification implements Notification{
    public void SendMessage() {
        System.out.println("Notification send through Email");
    }
}

class SMSNotification implements Notification{
    public void SendMessage() {
        System.out.println("Notification send through SMS");
    }
}

class MainClass_5{
    public static void main(String[] args) {
        Notification obj;
        obj = new EmailNotification();
        obj.SendMessage();

        obj = new SMSNotification();
        obj.SendMessage();
    }
}
