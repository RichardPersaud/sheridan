package sheridan;

//import java.util.Scanner;
//OR
import java.util.*;

public class ShapeFun {
    
    public static void main(String[] args){
// Prompt the user for input
        //Print on next line
        System.out.println("Please enter the radius of the circle: ");
        //Print on the same line
       // System.out.print("Please enter the radius of the circle: ");
        
// Read the input using a Scanner object
        Scanner input = new Scanner(System.in);
        double radiusFromUser = input.nextDouble();
        
        ShapeFun self = new ShapeFun();
        double circleArea;
        circleArea = self.calculateArea (radiusFromUser);
        
// Present the output to the user
        System.out.println("The area is " + circleArea);
        
    }
    
    
    
    
    
    
    public double calculateArea(double radius){
   
    // Use the input value to calculate area of the circle
        double circleArea = 3.1415927 * radius * radius;
        
        return circleArea;
        
    
    }
        
    
} // End of class ShapeFun