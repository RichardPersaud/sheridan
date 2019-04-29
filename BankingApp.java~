/*
 * author: Elmira Adeeb
 * purpose: Develop a class to test the Account.java class
 */
package sheridan;
import java.util.*; // used for input

public class BankingApp {
    public static void main(String[] args) {
        // Declarations & iinitializations
        Scanner scan = new Scanner(System.in);
        Account acc = new Account();
        // user input
        System.out.printf("Enter your full name : ");
        acc.setFullName(scan.nextLine());
        // initial balance 
        System.out.printf("\nEnter your initial account balance : ");
        acc.setBalance(scan.nextDouble());
        // amount to deposit
        System.out.printf("\nEnter deposit amount : ");
        acc.deposit(scan.nextDouble());
        // print balance
        acc.printBalance();
        // amount to withdraw
        System.out.printf("\nEnter withdraw amount : ");
        acc.withdraw(scan.nextDouble());
        // print balance
        acc.printBalance();
        
        scan.close();
    }// end of the main method
} // end of the AccountApp class
