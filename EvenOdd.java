package sheridan;
import java.util.*;

public class EvenOdd{
    
    public static void main(String[] args){
        
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8};
        int[] odd= new int[arr.length];
        int[] even= new int[arr.length];
        int eindex =0;
        int oindex =0;
      
        for(int i = 0; i < arr.length; i++)
            if(arr[i]%2==0){
             even[eindex++];
           
        }else{
        
              odd[oindex++];
        }
       
        
        
        System.out.println(Arrays.toString(odd));
        System.out.println(Arrays.toString(odd));
        
    }
    
}