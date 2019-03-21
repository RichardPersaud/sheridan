package sheridan;
import java.util.Scanner;
public class IfTest2 {
    
    public static void main (String[] args) {
        System.out.print("Please enter the value of x: ");
        
        Scanner input = new Scanner(System.in); // Scanner to ask for input
        int x = input.nextInt();
        
        if (x == 3) {
            System.out.println("x is 3");
        }
        else {
            System.out.println("x is NOT 3");
        }
        
        System.out.println("This runs no matter what");
    }
}