import java.util.*;

public class factorial{
    
    static int factorial(int n){      
        if (n == 1)      
            return 1;      
        else      
            return(n * factorial(n-1));      
    }  
    
    static int n1=1,n2=1,n3=1;
    
    static void printFibo(int n){
        
        if(n>0){      
            n3 = n1 + n2;      
            n1 = n2;      
            n2 = n3;     
            
            
            System.out.print(" "+ n3);     
            printFibo(n-1);      
        }      
    }        
    
    public static void main(String[] args) {  

        System.out.println("Factorial of 5 is: " + factorial(5));  
        
        System.out.println("Enter a value to fibonacci: ");
         Scanner input = new Scanner(System.in);
        int in = input.nextInt();
            
        int n = in;
        
        System.out.print("Fibonacci series:  "+n1+" "+n2);//printing 0 and 1   
        
        printFibo(n-2);//n-2 because 2 numbers are already printed     
    }  
}  