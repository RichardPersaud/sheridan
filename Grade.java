package sheridan;

import java.util.Scanner;

public class Grade{
    
    public static void main(String[] args){
        
                
        int grade;
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter Your Grade Here!>>");
        grade = input.nextInt();
       
        if(grade == 100) {
            System.out.println(" A+ Yayy..");
        }
        else if(grade >= 80){
            System.out.println(" You got an A ");
        }
        else if(grade >= 70){
            System.out.println(" You got an B ");
        }
        else if(grade >= 60){
            System.out.println(" You got an C ");
        }
        else if(grade <= 60){
            System.out.println(" You got an C-");
        }
        
        else if(grade <= 49){
            System.out.println(" You got an F ");
            System.out.println(" Sorry you failed, Try again.. ");
        }
        
        else{
        System.out.println("INVALID INOUT #");
        }
        System.out.println("...");
    }
    
}