/*
 * author: Elmira Adeeb
 * purpose: Develop the Account.java class
 */

package sheridan;
import java.util.*;


// definition of the Account class
public class Account
{
 private String _fullName; // represents the name of the account holder
 private double _balance = 0.0; // represents the initial balance
 
 // set and get methods for _fullName
 public void setFullName(String fullName)
 {
  this._fullName = fullName;
 }
 
 public String getFullName()
 {
  return _fullName;
 }
 // set and get methods for _balance
 public void setBalance(double balance)
 {
  this._balance = balance;
 }
 
 public double getBalance()
 {
  return _balance;
 }
 // deposit method adds amount to the original balance
 public void deposit(double amount)
 {
  _balance += amount;
 }
 // withdraw method subtracts amount from the original balance
 public void withdraw(double amount)
 {
  _balance -= amount;
 }
 
 // printBalance prints the balance
 public void printBalance(){
  System.out.println("The current balance is :"+_balance);
 }
 
}// end of the class Account
