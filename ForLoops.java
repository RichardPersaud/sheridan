package sheridan;

import java.util.*;

public class ForLoops{

    public static void main(String[] args){
        
       long sum = 0;
    
        for (int num = 1; num <= 1000; num++)
        {
          sum = sum + num;
        }
        
        System.out.println("the sum of 1-100 is " + sum);
    
    }


}