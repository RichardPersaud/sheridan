package sheridan;

import java.util.*;

public class DivisibleNum{
    
    public static void main(String[] args){
       
        int num = 100;
        int counter = 0;
        
        while (num <= 3000){
            if (num % 23 == 0){
                System.out.println(num);
                counter++;
            }
            num++;
           
        }
        System.out.println("Counter Found = " + counter);
    }
}
    
    