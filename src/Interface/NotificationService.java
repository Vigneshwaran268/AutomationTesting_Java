/*3. Online Food Delivery Notification System

Implement multiple notification services using interfaces.

Requirements:

Interface: NotificationService
Method:
sendNotification(String message)
Implementations:

EmailNotification
SMSNotification
PushNotification
Challenge:

Send notifications to all services using interface references.

 */

package Interface;

interface NotificationService {
    void sendNotification(String message);
}

class EmailNotification implements NotificationService{
    public void sendNotification(String message){
        System.out.println("Email Notification: "+message);
    }
}

class SMSNotification implements NotificationService{
    public void sendNotification(String message){
        System.out.println("SMS Notification: "+message);
    }
}

class PushNotification implements NotificationService{
    public void sendNotification(String message){
        System.out.println("Push Notification: "+message);
    }
}

class MainNotification{
    public static void main(String[] args) {
        NotificationService obj;
        obj = new EmailNotification();
        obj.sendNotification("Food Delivered");

        obj = new SMSNotification();
        obj.sendNotification("Food Delivered");

        obj = new PushNotification();
        obj.sendNotification("Food Delivered");
    }

}

