//Richard Persaud

//Name of package/folder
package sheridan;// optional: (show take out this line)

// used for user input
import java.util.Scanner;

//Name Of Class 
public class SeparateFourValues {
    
    // Declaration to store user Input Value into variable "num"
    public int num;
    
    //Below contains the algorithm for this Program
    
    //method for each Value
    public int V4(){ 
        
        // math
        int V1 = num / 1000 * 1000; //value 1
        int b = num - V1;
        int V2 = b / 100 * 100; // value 2
        int d = num - V2 - V1;
        int V3 = d / 10 * 10;  // value 3
        int V4 = num - V2 - V1 - V3;
        
        return V4; // value 4
    } 
    
    // main method of the program
    public static void main(String[] args) {
        
        // Declarations & Intialization
        CalculateFourValues self = new CalculateFourValues();
        //object variable
        
        //allows user input to java
        Scanner input = new Scanner(System.in);
        
        //User Input
        System.out.println(" Enter A Four Digit Value: ");
        //Stores user input into variable "num"
        self.num = input.nextInt();
        
        // calling method and variables
        int valueOne;
        valueOne = self.V1(); //value 1
        
        int valueTwo;
        valueTwo = self.V2();//Value 2
        
        int valueThree;
        valueThree = self.V3();//Value 3
        
        int valueFour;
        valueFour = self.V4();//Value 4
        
        //printing the result          
        System.out.println(valueOne+"   "+valueTwo+"   "+
                           valueThree+"   "+valueFour);
        //Outputs V1, V2, V3, V4 with three spaces between
    }
}