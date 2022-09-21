// import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        Item item1 = new Item();
        item1.name =  "Capuccino";
        item1.cost = 4.5;

        Item item2 = new Item();
        item2.name = "Frappucino";
        item2.cost = 6.5;

        Item item3 = new Item();
        item3.name = "Coffee";
        item3.cost = 3;
    
        Order order1 = new Order();
        order1.name = "Cindy";
        order1.ready = false;
        order1.items.add(item1);
        order1.items.add(item2);
        System.out.println(order1.total = order1.getOrderTotal());

    
    }
}
        // Application Simulations
        // Use this example code to test various orders' updates
    //     System.out.printf("Name: %s\n", order1.name);
    //     System.out.printf("Total: %s\n", order1.total);
    //     System.out.printf("Ready: %s\n", order1.ready);
    // }