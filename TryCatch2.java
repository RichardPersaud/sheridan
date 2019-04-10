package sheridan;
import java.util.*;

public class TryCatch2{
    
    public void calculate(int num){
        
        Random rand = new Random();
        
        int r = rand.nextInt(num) + 1;
        
        System.out.print("Your Random number is:" + r + "\n");
        
    }
    
    public static void main(String[] args){
        
        TryCatch2 self = new TryCatch2(); 
        Scanner input = new Scanner(System.in);
        int num = -1;
        
        
          System.out.print("Enter a whole number: ");
        
        while(num != 0){// (Assignment) != 999
            
            try{
              
                num = input.nextInt();

                
                //sending
                self.calculate(num);
                
            }
            
            catch(Exception e){
                
                System.out.println("INVALID NUMBER. Please enter a whole number "
                                       + e.getMessage());
                input.next();
                
                continue;
                
            }
        }
    }
}