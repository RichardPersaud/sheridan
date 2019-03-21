package sheridan;

import java.util.Scanner;// used for user input

public class CalculateFourValues {
    
    // Declaration to store user Value 
   public int num;
    
    // divition method for first value Part.1
    public int V1() {
        int V1 = num / 1000;
        
        return V1; //Stands for value 1
    }
    
   
    //method for second Value Part.2
    public int V2(){ 
        int V1 = num / 1000 * 1000;
        int sum = num - V1;
        int V2 = sum / 100;
        
        return V2; // value 2
    }
    
    //method for Third Value Part.3
    public int V3(){ 
        
        int V1 = num / 1000 * 1000;
        int b = num - V1;
        int V2 = b / 100 * 100;
        int d = num - V2 - V1;
        int V3 = d / 10;
        
        
        return V3; // value 3
    }
    
    
      //method for Forth Value Part.4
  public int V4(){ 
     
        int V1 = num / 1000 * 1000;
        int b = num - V1;
        int V2 = b / 100 * 100;
        int d = num - V2 - V1;
        int V3 = d / 10 * 10;
        int V4 = num - V2 - V1 - V3;
     
        return V4; // value 3
    }
    
    
    
    // main method
    public static void main(String[] args) {
        // Declarations & Intialization
        CalculateFourValues self = new CalculateFourValues();//object variable
        Scanner input = new Scanner(System.in);
        
        //Input
        System.out.println("Enter A Four Digit Value: ");
        self.num = input.nextInt();
        
        // call method
        int valueOne;
        valueOne = self.V1();
        
        int valueTwo;
        valueTwo = self.V2();
        
        int valueThree;
        valueThree = self.V3();
        
        int valueFour;
        valueFour = self.V4();
        
        //printing the result          
        System.out.println("  "+valueOne+"  "+
                           valueTwo+"  "+valueThree+"  "+valueFour);
        
    }
}