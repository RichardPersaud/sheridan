//Richard Persaud

package sheridan; // from sheridan directory

import java.util.*; //importing java utility files 

public class CalStat{ //created class
    
    //initializing and assigning variables
   public int number = 0;
   public int positives = 0;
   public int negatives = 0;
    
   public int count = 0;
   public int total = 0; 
    
   public int largest = Integer.MIN_VALUE;
   public int smallest = Integer.MAX_VALUE;
    
    //calculate method that does the work for main
   public void calculate(){
       //prompts the user to enter values and end it with 999
          System.out.print("Enter one or more integers (999 marks the end of input): ");
        Scanner input = new Scanner(System.in);// accepts user inputs
       
               // as long as number is not 999 it loops until
        while(number != 999) {
            
            number = input.nextInt();
            
            
            if(number == 999){
                break; // breaks the program if user enters 999
            }
            
            if (number >= 0)//if number is greater or eqaul to 0
                //increments by 1
                positives++;
            else
                //increments by 1
                negatives++;
            
            // conditional statements to get Max Value
            if(number > largest) {
               largest = number;
            }
            
             // conditional statements to get Min Value
            if (number < smallest) {
                smallest = number;
            }
            
        // totial adds number and stores itself
           total += number;
            
           // increments
            count++;
            
        }
   }
    
    //main method of the program
    public static void main(String[] args) {

     
        //creating a self object to access methods in class
        CalStat self = new CalStat();
        
        //calling on the calculate method
        self.calculate();
        
         // Calculate the average of total and count and stoes it in average
        double average = (double) self.total / self.count;
   
       
        // Output statements of results
        System.out.println("The total is: " + self.total +
                           "\nThe average is: " + average +
                           "\nThe number of positive is: " + self.positives +
                           "\nThe number of negatives is: " + self.negatives +                       
                           "\nThe highest number is: "+ self.largest +
                           "\nThe lowest number is: "+ self.smallest);
    }
}