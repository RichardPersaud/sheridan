package sheridan;

import java.util.Scanner;// used for user input

public class AddTwoNumbersCopy {
    
    // fields declaration 
    private int num1;
    private int num2;
    
    public void setNum1( int newNum1 ) {
        num1 = newNum1;
    }
    
    public void setNum2( int newNum2) {
        num2 = newNum2;
    }
    
    // add method
    public int add() {
        int result = num1 + num2;
        
        return result;
    }
    
    // main method
    public static void main(String[] args) {
        // Declarations & Intialization
        AddTwoNumbersCopy self = new AddTwoNumbersCopy(); //object variable
        Scanner input = new Scanner(System.in);
        
        //Input
        System.out.println("Enter a value for num1: ");
        self.num1 = input.nextInt();
        
        // using print instead of println
        System.out.print("Enter a value for num2: ");
        self.num2 = input.nextInt();
        
        // call method add to add numbers
        int sum;
        sum = self.add();
        
        //printing the result          
        System.out.println("The result is: " +  sum );
        
    }
}