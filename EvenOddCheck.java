package sheridan;
import java.util.*;

public class EvenOddCheck {
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in); // Scanner to ask for input
        
        System.out.print("Please enter a number");
        int num = input.nextInt();
        
        if (num % 2 == 0){ // checking for even number
            System.out.print("Even Number");
        }
  
        else {//Odd checking
            System.out.print("Not Even but Odd number");
        }
        
    }
}