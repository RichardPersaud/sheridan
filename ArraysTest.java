package sheridan;
import java.util.*;
import java.math.*;

public class ArraysTest{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
          System.out.println("enter a number");
        int in = input.nextInt();
        
        int arr[] = new int[in];
        
         for(int index = 0; index<arr.length; index++){
                arr[index] = index + 1;
                
            }
        
        for(int index = 0; index<arr.length; index++){
        
            System.out.println(arr[index]);
        }
            
         System.out.println();
         
        System.out.println("size..." + arr.length);
        
        System.out.println("reference "+ arr);
    
 
    } 
}