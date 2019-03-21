//Richard Persaud 02-25-19
// Assignment 2
//importing java util tools (Scanner and Random)
import java.util.*;
public class HeadsOrTails{
    
     // main method
    public static void main(String[]args){
         //Declaration and Initialization
        int Num = 0;
        int numflips = 0;
        Scanner in = new Scanner(System.in);// Scanner to ask for input
         
        //Asking User for 3 option input
        System.out.println("How many times you would like to toss the coin? ");
        System.out.println(" 1 = 2  Times \n 2 = 5  Times \n 3 = 10 Times");
       
         Num = in.nextInt();
        
         //switch case for 3 input choices
       switch (Num){
           case 1: numflips = 2;
           break;                //breaks the switch for each case 
           case 2: numflips = 5;
           break;                //breaks the switch for each case 
           case 3: numflips = 10;
           break;                //breaks the switch for each case 
           
           //Anything other than 1,2 or 3 is error
           //runs if no break statement
           default: System.out.println("Error");      
       }
        //Declaration and Initialization
        //call method using self object
       HeadsOrTails self = new HeadsOrTails(); 
       //calling the flip method
       self.flip(numflips);
    }
 
    public void flip(int flips){
         //Declaration and Initialization
        int heads = 0;
        int tails = 0;
        int count = 1;
        int randNum = 0;
       
        //As long as flips is grater than or equals to count it repeats
        while(flips >= count)
            //for loops could also work 
        {
            
       Random rand = new Random();//calling Random method
       randNum = rand.nextInt(); //Gen random num
             
       //if statement
            if(randNum < 0.5)  //(true option)
            {
                System.out.println("\t heads");
                heads++;     //counts heads + 1
            }
            else           //else (false option)
            {
                System.out.println("\t tails");
                tails++;      //counts tails + 1
             }
            count++;      
        }
        // Outputs the results of each iteration and display counts
         System.out.println("Result: " +heads+ " Heads"+" and "
                               +tails+" Tails");
    }
}