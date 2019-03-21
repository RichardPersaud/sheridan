package sheridan;
import java.util.*;

public class RandomNumCalAverage{
    
    public int sum = 0;
    public int count = 0;
    
    public int  Cal(){
    
     Random rand = new Random();
        
        int sum = rand.nextInt(100) + 1;
        
        System.out.println(sum);
    }

    public static void main(String[] args){
       
         RandomNumCalAverage self = new RandomNumCalAverage();
         
         self.printCal();
         self.printCal();
         self.printCal();
         self.printCal();
         self.printCal();
         
         double average = (double)self.sum / self.count;
         
         System.out.print("The Average is: " + average);
         
    }

}