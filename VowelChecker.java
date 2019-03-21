package sheridan;

import java.util.*;

public class VowelChecker{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        String Vowel;
        
        System.out.println("Enter a Letter");
        Vowel = input.nextLine();
        
        switch (Vowel){
            
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U": 
                System.out.println("This is a Vowel");
                break;
                
            default:
                System.out.println("This is not a Vowel");
                
        }
        
    }
    
}