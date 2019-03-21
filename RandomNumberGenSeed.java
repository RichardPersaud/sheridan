package sheridan;

import java.util.*;

public class RandomNumberGenSeed{
    
    public static void main(String[] args){
        //Declaration and Initialization
   Random rand = new Random();
   
   rand.setSeed(21);
     
   int num = rand.nextInt(100) + 1;
   
   double num2 = rand.nextDouble() * (5) + 15;
   
   double num3 = rand.nextDouble() * (2) + (-1);
        
        
        System.out.println(" Frist value is " + num);
        System.out.println(" Second value is " + num2);
        System.out.println(" Third value is " + num3);
    
    }

}