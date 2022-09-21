import java.util.Random;

public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    public static int members = 0;
    public static double totalAllAccounts = 0;
    Random randMachine = new Random();

    //constructors : overloaded
    public BankAccount(){
        members++;
    }
    public BankAccount(double checking){
        this.checkingBalance = checking;
        members++;
        totalAllAccounts += checking;
    }
    public BankAccount(double checking, double savings){
        this.checkingBalance = checking;
        this.savingsBalance = savings;
        members++;
        totalAllAccounts += (checking + savings);
    }


    public double totalCheckingBalance(){
        return checkingBalance;
    }
    public double totalSavingsBalance(){
        return savingsBalance;
    }
    public double totalAccountBalance(){
        return checkingBalance + savingsBalance;
    }
    public void depositToAccounts(double checking, double savings){
        checkingBalance += checking;
        savingsBalance += savings;
        totalAllAccounts += (checking + savings);
    } 
    public void withdrawFromAccounts( double checking , double savings ){
        if(checkingBalance > checking){
            checkingBalance -= checking;
        }
        if( savingsBalance > savings ){
            savingsBalance -= savings;
        }
        totalAllAccounts -= (checking + savings);
    } 

}