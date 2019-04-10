package sheridan;

import java.util.*;

public class GuessingGames{

    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    
   int correctGuess = 5;
          int randNum = rand.nextInt(0, 10);
    
    for(int i=1; i < 3; i++){
        
    System.out.pritnln("Larry Guess: " + randNum);
    int larry = input.nextInt();
    
    
    System.out.println("Curly Guess: " + randNum);
    int curly = input.nextInt();
    
    
    System.out.println("Moe Guess: " + randNum);
    int moe = input.nextInt();
    
    
    if(larry == correctGuess){
        System.out.println("Larry Won!!!");
            
        if(curly == correctGuess){
            System.out.println("Curly Won!!!");
                
                if(moe == corrrectGuess){
                System.out.println("Moe Won!!!");
            
            }
        
        }
    
    }else{
    System.out.println("Try Again!....");
    }
        
    }


}

