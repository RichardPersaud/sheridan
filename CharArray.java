import java.util.*;

public class CharArray{

    public static void main(String[] args){
        
        char[] letters = {'A','B','C'};
   
        for(int i = 0; i < letters.length; i++){
            if (letters[i] >= 'A' && letters[i] <= 'Z'){
                letters[i] = (char)(letters[i] + 32);
                
            }else if (letters[i] >= 'a' && letters[i] <= 'z'){
                letters[i] = (char)(letters[i] - 32);
                }
                
                char[] letters = new char[];
                
                System.out.print(" "+ letters)

        }
    
    }

}