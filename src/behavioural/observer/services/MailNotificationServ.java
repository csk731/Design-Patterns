package behavioural.observer.services;

import behavioural.observer.Walmart;
import behavioural.observer.eventsubscribers.OrderPlacedEventSubscriber;

public class MailNotificationServ implements OrderPlacedEventSubscriber {
    public MailNotificationServ() {
        Walmart.getInstance().register(this);
    }
    public boolean sendNotification() {
        System.out.println("E-Mail Sent");
        return true;
    }
}
