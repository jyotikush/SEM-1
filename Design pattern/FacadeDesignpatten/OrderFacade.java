package facadedesignpattern;


public class OrderFacade {
    WaiterSubsystem1 waiter = new WaiterSubsystem1();
    KitchenSubsystem2 Kitchen = new KitchenSubsystem2();
    
    public void OrderFood(){
        waiter.writerOrder();
        waiter.sendtoKitchen();
        Kitchen.prepareFood();
        Kitchen.callWaiter();
        waiter.serveCustomer();
        Kitchen.washDishes();
        
    }
    
}
