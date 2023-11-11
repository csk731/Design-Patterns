package structural.facade.inventory;

public class InventoryService1 implements InventoryService{
    public boolean updateItemInventory(long id, int byWhat){
        // Operation
        System.out.println("Inventory Updated");
        return true;
    }
}
