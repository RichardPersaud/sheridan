//Richard Persaud
//Yashaswi Pandey

package sheridan;

import java.util.*;//importing java package

public class RandNum{
    
    public static void main(String[] args){
        
        //initializing and dclaring variables
        Random rand = new Random();
        double randNum;
        
        //generating random numbers until one greater than 0.99 and printing it
        do{
            randNum = rand.nextDouble();
            System.out.println(randNum);
            
        } while(randNum<=0.99);
            
            System.out.println("Final random num > than 0.99 " + randNum);
        
    }
    
}