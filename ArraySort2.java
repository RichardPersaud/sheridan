package sheridan;

import java.util.*;

public class ArraySort2{


    public static void main(String[] arg){
    
    
        int[] arr = {32, 23, 5, 45, 1, 55, 55, 53};
        
        System.out.print("before: ");
        
        for(int i = 0; i < arr.length; i++){
        
        System.out.print(arr[i]+ " ");
        
        }
        
        Arrays.sort(arr);
        
        System.out.print("after: " + Arrays.toString(arr));
        
    }

}