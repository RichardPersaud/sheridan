package sheridan;

import java.util.*;

public class FindCurrent{
    
// main method
    public static void main(String[]args){
         //Declaration and Initialization
        Scanner in = new Scanner(System.in);// Scanner to ask for input
         
        //Asking User
        System.out.print("Enter the resistance: ");
         double resis = in.nextDouble();
        System.out.println("Enter the voltage: ");
         double vol = in.nextDouble();
 
        //Declaration and Initialization
        //call method using self object
       FindCurrent self = new FindCurrent(); 
       //calling
       self.calculateCurrent();
    }
 
    public double calculateCurrent(){
         //Declaration and Initialization
        double vol;
        double resis;
       
      double i = vol / resis;
       
      
        // Outputs the results of each iteration and display counts
         System.out.println("the current: " +vol+ " voltage"+" and "
                               +resis+" resistance is"+ i);
         
         return i;
    }
}