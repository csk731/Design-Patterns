package behavioural.observer.services;

import behavioural.observer.Walmart;
import behavioural.observer.eventsubscribers.OrderPlacedEventSubscriber;

public class LogisticServ implements OrderPlacedEventSubscriber {
    public LogisticServ() {
        Walmart.getInstance().register(this);
    }

    public boolean sendNotification() {
        System.out.println("Logistics Request Sent");
        return true;
    }
}
