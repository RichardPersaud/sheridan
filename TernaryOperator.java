package sheridan;

import java.util.*;

public class TernaryOperator{

    public static void main(String[] args){
    
        int userGuess = 5;
        int gameGuess = 5;
        
       String msg = (userGuess == gameGuess) 
           ? "User Guessed Correctly, Congrats"
           : "Wrong Guess, Please try again.";
       
       System.out.println(msg);
    
    }

}