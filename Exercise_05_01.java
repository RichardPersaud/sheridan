
import java.util.Scanner;

public class Exercise_05_01 {
    
    
    
    
    
    
    
    public static int getMaxValue(int[] numbers){
        int maxValue = numbers[0];
        for(int i=1;i < numbers.length;i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }
    public static int getMinValue(int[] numbers){
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int positives = 0;  // Count the number of positive numbers
        int negatives = 0;  // Count the number of negative numbers
        int count = 0;   // Count all numbers
        int total = 0;  // Accumulate a totol
        
        
        // Promopt the user to enter an integer or 999 to exit
        System.out.print("Enter one or more integers (999 marks the end of input): ");
        int number = input.nextInt();
        
        while (number == 999) {
            System.out.println("No Numbers Entered");
            
            input.next();
            continue;
            
        }
        
        while (number != 999) {
            
            if (number > 0)
                positives++; // Increase positives
            else
                negatives++; // Increase negatives
            
            
            total += number; // Accumulate total
            
            count++;    // Increase the count
            number = input.nextInt();
        }
        
        // Calculate the average
        int average = total / count;
        
        // Display results
        System.out.println(
                           "The number of positive is " + positives +
                           "\nThe number of negatives is " + negatives +
                           "\nThe total is total " + total +
                           "\nThe average is " + average);
    }
}