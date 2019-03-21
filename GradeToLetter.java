package sheridan;

import java.util.*;

public class GradeToLetter{

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        String grade;
        
        System.out.print("Enter A Letter Here >>");
        grade = input.nextLine();
        
        if(grade == "A"){
            System.out.println("You got 85 to 100");
        }
        else if(grade == "B"){
            System.out.println("You got 65 to 84");
        }
        else if(grade == "C"){
            System.out.println("You got 50 to 64");
        }
        
        else if(grade == "D"){
            System.out.println("You got below 50");
            System.out.println("You Failed");
        }
        
        else if(grade == "F"){
            System.out.println("You got below 50");
            System.out.println("You Failed");
        }
        
        else{
            System.out.println("INVALID INPUT");
        }
    System.out.print("Try Another Input");
    }

}
