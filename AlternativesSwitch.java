//import from sheridan folder
package sheridan;

//imported java scanner package
import java.util.*;

//Class named AlternativesSwitch
public class AlternativesSwitch{
    
    //main method
    public static void main(String[] args){
        
        
        //Declaration and Initialization
        Scanner input = new Scanner(System.in);
        int keyboard;
        
        System.out.println("Starting Game..");        
        //store user input into keyboard
        keyboard = input.nextInt();
        
        
        //This game makes a move from the keyboard input between 1-9
        
        switch (keyboard){//start of switch

            case 2: 
                System.out.println("Move down");
                break;
                
            case 4: 
                System.out.println("Move left");
                break;
                
                
            case 6: 
                System.out.println("Move right");
                break;
                
            case 8: 
                System.out.println("Move up");
                break;
                
                
                //fall-through cases
            case 1:
            case 3:
            case 7:
            case 9: 
                System.out.println("dialogal move not allowed");
                break;
                
                
            default:
                System.out.println("Bad input");
                
        }//end of switch
        
    }//end of main method
    
}//end of class