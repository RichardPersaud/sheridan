package sheridan;
import java.util.*;
import java.math.*;

public class Arraytest2{
   
    
    public static void main(String[] args){
        
//        Scanner input = new Scanner(System.in);
//        
//          System.out.println("enter a number");
//        int in = input.nextInt();
        
        Random rand = new Random();
        
        int arr[] = new int[20];
        
        for(int index = 0; index<arr.length; index++){
            arr[index] = rand.nextInt(100) + 1;
            
        }
        
        //loop to search7
        
        int searchItem = 72;
        int foundIndex = -1;
       // boolean foundFlag = false;
        
        for(int index = 0; index< arr.length; index++){
            if( arr[index]== searchItem){
               // foundFlag = true; 
                // place finder
                foundIndex = index;
                break;
            }
            
        }//end of loop
        System.out.println(foundIndex != -1 
                               ?"Item FOUND in "+foundIndex 
                               :"Item NOT found...try again");
        
//            if(foundFlag == true){
//                System.out.println("Item FOUND!");
//            }else{
//                System.out.println("Item NOT found");
//            }
//        
        
        
        for(int index = 0; index<arr.length; index++){
            
            System.out.print(arr[index]+ " ");
        }
        
        System.out.println(" ");
        
        System.out.println("size..." + arr.length);
        
        System.out.println("reference "+ arr);
        
        System.out.println(".................................................");
        
        
        String[] monthList= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
            "Aug", "Sep", "Oct", "Nov", "Dec"};
        
        for(int index = 0; index <monthList.length; index++)
        {
            System.out.println("monthList[" + (index + 1) + "] = " + monthList[index]);
        }
        
        
    } 
}