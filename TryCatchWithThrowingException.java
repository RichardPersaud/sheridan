package sheridan;

import java.util.*;

public class TryCatchWithThrowingException {
    
    public static void main(String[] args) {
        
        TryCatchWithThrowingException self = new TryCatchWithThrowingException();
        Scanner in = new Scanner(System.in);
        int num = -1; // -1 to get in loop for 1st time
        
        
        // enter numbers until 0 recieved
        while(num != 0) {
            
            try {
                System.out.print("Enter a whole number: ");
                num = in.nextInt();
                self.calculate(num);
            }
            catch(IllegalArgumentException e) {
                System.out.println("Invalid number. " + e.getMessage());
            }
            catch(Exception e) {
                System.out.println("Invalid number. Please enter a whole no.");
                in.next();
                //in = new Scanner(System.in);
                continue;
            }
        } // end of while loop
        
        System.out.println("The end of program");
        
    } // end of main
    
    
    // Generate and print a random no. in [1 - n] range
    public void calculate(int n) {
       
        if (n < 1 || n > 100) // throw an exception
            throw new IllegalArgumentException("Value out of range." +
                                    " Please use a number between 1 and 100");
        Random rnd = new Random();
        int r = rnd.nextInt(n+1);
        
        System.out.println("Random no. is : " + r);
    }
    
}