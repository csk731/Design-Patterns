package structural.facade;

import structural.facade.helpers.PlaceOrderHelper;
import structural.facade.inventory.InventoryService1;
import structural.facade.logistics.LogisticsService1;
import structural.facade.notification.AppNotificationService;

public class Client {
    public static void main(String[] args) {
        Amazon amazon=new Amazon(new PlaceOrderHelper(new InventoryService1(), new LogisticsService1(), new AppNotificationService()));
        amazon.placeOrder(497383,2);
        amazon.cancelOrder(497383);
    }
}
