package sheridan;

import java.util.*;

public class SumArrayPartTwo{
    
    
 /////////////////........Practice..........///////////////////////////////////       

        
    public void compareTo(){
        
        int num1 = 0;
        int num2 = 0;
 Scanner input = new Scanner(System.in);
        System.out.println("Enter value for X");
        num1 = input.nextInt();
        
        
        Integer x = new Integer(num1);
        
        System.out.println("Enter value for Y");
        num2 = input.nextInt();
        
          Integer y= new Integer(num2);
          
          int retResult =  x.compareTo(y); 
          
          if(retResult > 0) {  
              
             System.out.println("x is greater than y\n");  
             
          } else if(retResult< 0) {  
              
             System.out.println("x is less than y\n");  
             
          } else {  
              
             System.out.println("x is equal to y\n");  
          }  
  
        
    }
    
    public void subString(){
        
       
       Scanner input = new Scanner(System.in);
       String s1;
       
       System.out.println("Enter string to check");
       s1 = input.nextLine(); 
       
       int num = 1;
       for(int i = 0; i < num; i++){
           
           System.out.println("Check for: ");
           String ch = input.nextLine();
           
           if(s1.contains(ch)){
           System.out.println("yes");
           
           }else{
           
           System.out.println("no");
           }
       
       }
  
    }
    
    public void arraySortEtc(){
        
        int size =0;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter array size");
        size = input.nextInt();
        
        int a[] = new int[size];
        
        System.out.println("Enter the values for array: ");
        
        for(int i = 0; i < size; i++){
        a[i] = input.nextInt();
        
        sum = sum + a[i];
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after sorting:>>> "+ Arrays.toString(a));    
            
        System.out.println("the sume is: "+sum);
    
    }
    
    
    public void starTriangle(){
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of triangle");
        int size = input.nextInt();
    
       int i, j, k;

       for(i = 0; i<size +1; i++){
       
           for(j = size; j>i; j--){
           System.out.print(" ");
           }
           
           for(k = 0; k<(2*i -1); k++){
           System.out.print("*");
           
           }
           
           System.out.println();
       }
    
    
    }
    
   
}