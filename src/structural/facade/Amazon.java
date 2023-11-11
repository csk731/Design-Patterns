package structural.facade;

import structural.facade.helpers.PlaceOrderHelper;

public class Amazon {
    PlaceOrderHelper placeOrderHelper;

    public Amazon(PlaceOrderHelper placeOrderHelper) {
        this.placeOrderHelper = placeOrderHelper;
    }

    public boolean placeOrder(long id, int count){
        placeOrderHelper.placeOrder(id,count);
        return true;
    }
    public boolean cancelOrder(long id){
        System.out.println("Your Order has been cancelled");
        return true;
    }
}
