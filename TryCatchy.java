package sheridan;

import java.util.*;

public class TryCatchy {
    
    public static void main(String[] args) {
        
        TryCatchy self = new TryCatch();
        Scanner in = new Scanner(System.in);
        int num = -1; // -1 to get into loop for 1st time
        
        // enter numbers until 0 recieved
        while(num != 0) {
            
            System.out.print("Enter a whole number: ");
            num = in.nextInt();
            
            self.calculate(num);
            
        } // end of while loop
    } // end of main
    
    
// Generate and print a random no. in [1 - n] range
    public void calculate(int n) {
        Random rnd = new Random();
        
        int r = rnd.nextInt(n) + 1;
        
        System.out.println("Random no. is : " + r);
    }
    
}