package behavioural.observer;

import behavioural.observer.eventsubscribers.OrderPlacedEventSubscriber;
import behavioural.observer.services.InventoryServ;
import behavioural.observer.services.LogisticServ;
import behavioural.observer.services.MailNotificationServ;

import java.util.List;

public class Client {
    List<OrderPlacedEventSubscriber> orderPlacedEventSubscriberList;

    public static void main(String[] args) {
        Walmart walmart=Walmart.getInstance();

        // Registering serv's....
        MailNotificationServ mailNotificationServ=new MailNotificationServ();
        LogisticServ logisticServ=new LogisticServ();
        InventoryServ inventoryServ=new InventoryServ();
        walmart.placeOrder("1232",1);

        //De registering few serv's...
        walmart.deRegister(mailNotificationServ);
        walmart.placeOrder("3545",5);
    }
}
