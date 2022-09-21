import java.util.ArrayList;

public class Order {
    String name;
    double total;
    boolean ready;
    ArrayList<Item> items = new ArrayList<Item>();

    public double getOrderTotal(){
        double sum= 0.0;
        for (Item itemObj : items){
            sum += itemObj.cost;
        }
        return sum;
    }

    // public boolean orderReady(){
    //     if()
    // }
}