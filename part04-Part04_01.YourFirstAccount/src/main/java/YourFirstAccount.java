
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account myAccount = new Account("My account", 100.00);
        System.out.println("Initial state");
        
        System.out.println(myAccount);
        
        myAccount.deposit(20.0);
        
        System.out.println("The balance of my account is now " + myAccount);
    }
}
