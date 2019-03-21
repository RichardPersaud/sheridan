package sheridan;
import java.util.*;
public class test{

    
    public static void main(String[]args){
        int Num = 0;
        int numflips = 0;
       test self = new test(); 

        Scanner in = new Scanner(System.in);
         
        System.out.println("How many times you would like to toss the coin? ");
        System.out.println(" 1 = 2  Times \n 2 = 5  Times \n 3 = 10 Times");
       
        Num = in.nextInt();
        
       switch (Num){
           case 1: numflips = 2;
           break;
           case 2: numflips = 5;
           break;
           case 3: numflips = 10;
           break;
           
           default: System.out.println("Error");      
       }int a = self.flip(numflips);
    }
    double randNum = 0.0;
    
    public int flip(int flips){
        int heads = 0;
        int tails = 0;
        int counter = 1;
       
        while(counter <= flips)
            
        {
            
       Random rand = new Random();
       rand = rand.nextInt();
             
            if(randNum < 0.5)
            {
                System.out.println("\t heads");
                heads++;
            }
            else
            {
                System.out.println("\t tails");
                tails++;
               }
            counter++;      
        }
        
         System.out.println("Result:" + heads + " Heads" + " and " 
                               + tails + " Tails");
    }
}


