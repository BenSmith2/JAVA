public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double coffeePrice = 2.25;
        double frappacinoPrice = 5.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Lolo";
        String customer3 = "Tracy";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
         // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if (isReadyOrder2 == false){

            System.out.println(pendingMessage + customer2);
        }
        else{
            System.out.println(readyMessage + customer2);
            System.out.println(displayTotalMessage + mochaPrice);
        }
        if (isReadyOrder3 == false){
            isReadyOrder3 = true;
            System.out.println(displayTotalMessage + mochaPrice);
        }
        if(isReadyOrder1 == true){
            System.out.println(customer3+ frappacinoPrice + coffeePrice);
        }
    }
} 