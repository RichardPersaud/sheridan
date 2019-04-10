package sheridan;
import java.util.*;

public class TryCatch{
    
    public void calculate(int num){
        
        Random rand = new Random();
        
        int r = rand.nextInt(num) + 1;
        
        System.out.print("Your Random number is:" + r+"\n");
        
    }
    
    public static void main(String[] args){
        
        TryCatch self = new TryCatch(); 
        Scanner input = new Scanner(System.in);
        int num = -1;
        
        while(num != 0){
            System.out.print("Enter a whole number: ");
            num = input.nextInt();
            
            System.out.println("You have entered : " + num);
            
            //sending
            self.calculate(num);
        }
    }
}