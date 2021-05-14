	
package facadedesignpattern;


public class WaiterSubsystem1 {
    public void writerOrder(){
       System.out.println("Take order from classes;");
    }
    public void sendtoKitchen(){
        System.out.println("Waiter sends the order list to the kitchen:");
    } 
    public void serveCustomer()
    {
        System.out.println("Waiter servers the prepare food to the customer:");
    }
}
