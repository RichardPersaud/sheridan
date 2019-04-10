package sheridan;

import java.util.Random;

public class Array100
{
    public static void main(String[] args) {
        
        int size = 20; // or read its value from the user
        
         // array declaration
        int[] arr = new int[size];
        
        Random rand = new Random();
        
        // initializing the whole array
        for (int index = 0; index < arr.length; index++) {
            //arr[index] = -1;
            
            //arr[index] = i + 1; // to initialize each element to its order no.
            //arr[index] = (int) Math.pow(2,index); // initialize to 2 to power 0,1,2
            
            // Obtain a number between [0 - 99].
            arr[index] = rand.nextInt(100) + 1;
            
            // obtain values from user input
        }
        
        // loop to search for an item in the array
        int searchItem = 72;
        int foundIndex = -1;
        //boolean foundFlag = false;
        
        for (int index = 0; index < arr.length; index++) {
            
            if(arr[index] == searchItem ) {
                //foundFlag = true;
                foundIndex = index;
                break;
            }
        } // end of loop
        
        System.out.println( foundIndex != -1 ? "Item found in " + foundIndex:"Item NOT found!");
//        if( foundFlag == true ) {
//            System.out.println("Item found!");
//        }
//        else {
//            System.out.println("Item NOT found!");
//        }
        
        
        // usually one of more for loop to process array elements
        
        // printing out the array
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        
        System.out.println();
        System.out.println("The size of the array is " + arr.length);
        System.out.println("The address/reference of the array is " + arr);
        
        // array of strings example
        String[] nameList = {"John", "Mary", "George"};
        for(int index = 0; index < nameList.length; index++)
        {
            System.out.println("nameList[" + index + "] = " + nameList[index]);
        }
        
        String[] months = {"January" , "February" , "March" , "April", "May",
            "June", "July", "August", "September", "October",
            "November", "December"} ;
        
        System.out.println(months[5]);
    }
}