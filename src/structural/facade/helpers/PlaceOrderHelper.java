package structural.facade.helpers;

import structural.facade.inventory.InventoryService;
import structural.facade.logistics.LogisticsService;
import structural.facade.notification.NotificationService;

public class PlaceOrderHelper {
    InventoryService inventoryService;
    LogisticsService logisticsService;
    NotificationService notificationService;

    public PlaceOrderHelper(InventoryService inventoryService, LogisticsService logisticsService, NotificationService notificationService) {
        this.inventoryService = inventoryService;
        this.logisticsService = logisticsService;
        this.notificationService = notificationService;
    }

    public boolean placeOrder(long id, int count){
        inventoryService.updateItemInventory(id,count);
        logisticsService.informlogistics();
        notificationService.sendNotification();
        System.out.println("Thank you, Order Placed");
        return true;
    }
}
