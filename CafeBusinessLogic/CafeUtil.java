import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(){
        ArrayList<Integer> weekNum = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < 11; i++ ){
            weekNum.add(i+1);
            sum = sum + i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices){
        double sum = 0.0;
        for(int i = 0; i < prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menu){
        for(int i = 0; i < menu.size(); i++){
            String drink = menu.get(i);
            System.out.println(drink);
        }
    }
    public void addCustomer( ArrayList<String> customer){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        customer.add(userName);
        System.out.println("Hello:" + userName);
        System.out.println("There are:" + (customer.size()-1)+" in front of you.");
        System.out.println(customer);
    }
}
