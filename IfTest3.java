package sheridan;
import java.util.Scanner;

public class IfTest3 {
    
    public static void main (String[] args) {
        System.out.print("Please enter two letters of the alphabet: ");
        
        Scanner input = new Scanner(System.in); // Scanner to ask for input
        String line= input.nextLine();
        
        if (line.equals("Richard")) {
            System.out.println("String is Richard");
        }
        else {
            System.out.println("String is NOT Richard");
        }
        
        System.out.println("This runs no matter what");
    }
}