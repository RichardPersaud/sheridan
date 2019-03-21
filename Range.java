package sheridan;

import java.util.Scanner;

public class Range {
    
    
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.println ("Please enter a value between 1 and 100 ");
        
        number = input.nextInt();
        
        if (number >= 1 && number <= 100 ) 
        { 
            System.out.println ("Good job");
        }
        else{ 
            System.out.println ("The value is less than 0 or greater than 100");
        }
        
        
    }
    
}