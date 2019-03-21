// A sample Java program to sort an array of integers 
// using Arrays.sort(). It by default sorts in 
// ascending order 
import java.util.Arrays; 
  
public class ArraySort
{ 
  
    public static void main(String[] args) 
    { 
        // Our arr contains 8 elements 
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
        
        
        System.out.print("Orginal Order: ");
        
        for (int i=0; i < arr.length; i++){
            System.out.print (arr[i]+ " ");
        }
  
        Arrays.sort(arr);

        System.out.print("\n In Sorted Form: "+ Arrays.toString(arr)); 
    } 
} 