package behavioural.observer;

import behavioural.observer.eventsubscribers.OrderPlacedEventSubscriber;

import java.util.ArrayList;
import java.util.List;

public class Walmart {
    private static Walmart instance;
    private List<OrderPlacedEventSubscriber> orderPlacedEventSubscriberList;
    public static Walmart getInstance(){
        if(instance==null){
            synchronized (Walmart.class) {
                if (instance == null) {
                    instance = new Walmart();
                }
            }
        }
        return instance;
    }
    public boolean register(OrderPlacedEventSubscriber serv){
        orderPlacedEventSubscriberList.add(serv);
        return true;
    }
    public boolean deRegister(OrderPlacedEventSubscriber serv){
        orderPlacedEventSubscriberList.remove(serv);
        return true;
    }
    private Walmart(){
        orderPlacedEventSubscriberList=new ArrayList<>();
    }

    public boolean placeOrder(String id, int count){
        for(OrderPlacedEventSubscriber orderPlacedEventSubscriber:orderPlacedEventSubscriberList){
            orderPlacedEventSubscriber.sendNotification();
        }
        return true;
    }
    public boolean cancelOrder(String id){
        return true;
    }
}
