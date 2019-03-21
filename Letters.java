import java.util.*;

public class Letters {
    final static char[] table = {'Z','Y','X','W','V','U','T','S','R','Q','P','O','N',
                        'M','L','K','J','I','H','G','F','E','D','C','B','A'};
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the CAPITAL word:");
        
        String str = input.nextLine();
        char[] letters =  str.toCharArray();
        
        for(int i=0; i < letters.length; i++) {
         
            letters[i] = table[letters[i] - 'A'];
        }
        String strOut = new String(letters);
        System.out.print(strOut);
    }
}