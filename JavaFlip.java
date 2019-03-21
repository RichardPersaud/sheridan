package sheridan;
import java.util.*;
public class JavaFlip
{
    public void flip()
    {
        int heads = 0;
        int tails = 0;
        int counter = 1;
        double randNum = 0.0;
        Scanner in = new Scanner(System.in);
         
        System.out.println("How many times you would like to toss the coin? ");
        System.out.println(" 1 = 2  Times \n 2 = 5  Times \n 3 = 10 Times");
        int flips = in.nextInt();

        
        while(counter <= flips)
            
        {
            randNum = Math.random();
            System.out.print(counter);
             
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
        
    }  
        public static void main(String[] args){
            
            JavaFlip self = new JavaFlip();
            self.flip();
            
        System.out.println("Result:" + heads + " Heads" + " and " 
                               + tails + " Tails");
    
    }
}
