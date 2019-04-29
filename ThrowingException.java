package sheridan;
import java.util.*;

public class ThrowingException{
    
    public void calculate(int num){
        
        if(num < 1 || num > 100){
            throw new IllegalArgumentException("Value out of range."
                                      +"Please use a number between 1 and 100");
        }
        
        Random rand = new Random();
        
        int r = rand.nextInt(num) + 1;
        
        System.out.print("Your Random number is: " + r + "\n");
        
    }
    
    public static void main(String[] args){
        
        ThrowingException self = new ThrowingException(); 
        Scanner input = new Scanner(System.in);
        int num = -1;
        
        
                        System.out.print("Enter a whole number: ");
        
        while(num != 0){// (Assignment) != 999
            
            try{

                num = input.nextInt();

                //sending
                self.calculate(num);
            }
            
            catch(IllegalArgumentException e){
            
             System.out.println("INVALID NUMBER "
                                       + e.getMessage());
            
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