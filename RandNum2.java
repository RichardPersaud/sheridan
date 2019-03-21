//Richard Persaud
//Yashaswi Pandey

package sheridan;

import java.util.*; //importing java package

public class RandNum2{ 
    
    public void RandChecker(){
        
        //initializing and dclaring variables
        Random rand = new Random();
        double randNum;
        
        
        //generating random numbers until one greater than 0.99
        do{
            randNum = rand.nextDouble();
        } while(randNum<=0.99);
            
            System.out.println("random num > than 0.99 :  " + randNum);
        
    }
    
    public static void main(String[] args){
        
        //initializing and dclaring variables
        int loop;
        RandNum2 self = new RandNum2();
        
        //calling RandChecker method 5 times
        for(loop=1;loop<=5;loop++){
        self.RandChecker();
        }
    }
    
}