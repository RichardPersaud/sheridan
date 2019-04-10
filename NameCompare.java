package sheridan;

import java.util.*;

public class NameCompare{
    
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First String :");
        String FS = input.nextLine();
        
        System.out.println("Enter Second String :");
        String SS = input.nextLine();
        
        
        
        if(FS.equalsIgnoreCase(SS)){
            
            System.out.print("Same");
        }else{
            
            System.out.print("not Same"); 
        }
        
        
    }
    
    
}