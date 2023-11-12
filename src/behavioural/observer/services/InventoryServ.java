package behavioural.observer.services;

import behavioural.observer.Walmart;
import behavioural.observer.eventsubscribers.OrderPlacedEventSubscriber;

public class InventoryServ implements OrderPlacedEventSubscriber {
    public InventoryServ() {
        Walmart.getInstance().register(this);
    }

    @Override
    public boolean sendNotification() {
        System.out.println("Inventory Updated");
        return true;
    }
}
