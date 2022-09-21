public class Test{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        account1.depositToAccounts(50, 25);
        double total = account1.totalAccountBalance();
        System.out.println(total);
    }
}