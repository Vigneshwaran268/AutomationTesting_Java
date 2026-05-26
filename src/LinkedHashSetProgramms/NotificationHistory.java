package LinkedHashSetProgramms;

import java.util.LinkedHashSet;
import java.util.Set;

public class NotificationHistory {

    public static void main(String[] args) {
        Set<String> notification = new LinkedHashSet<>();
        notification.add("Missed Call");
        notification.add("Missed Call");
        notification.add("SMS Received");
        notification.add("Missed Call");
        notification.add("Order Shipped");
        System.out.println(notification);
    }
}
