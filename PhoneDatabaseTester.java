// Name:Richard Persaud ID:991535224
// Simple Table DataBase java Assignment #4

package sheridan; //folder called sheridan
import java.util.*; // java liburary with utilities


//Defining PhoneDatabaseTester class as public
public class PhoneDatabaseTester{
    
    //creating main method for program
    public static void main(String[] args){
        
        //calling the other class by creating an object DB
        PhoneDatabase DB = new PhoneDatabase();
        //Scanner accepts user input into "in"
        Scanner in = new Scanner(System.in);
        
        //creating try catch method to catch error to prevent crashes
        try {
            //Ask user for size of table 
            System.out.println("Enter Size Of Table:");
            //calls method from other class
            DB.getAdd();
            //Spacer
            System.out.println("\n....................................\n");
            
            //Displays the Sorted order of the table data
            System.out.print("Items In Alphabetical Sorted Order:\n \n");
            //calls sort() method from other class
            DB.sort();
            //Spacer
            System.out.println("\n....................................\n");
            
            //Search for table data entries
            System.out.println("Searching Items for: ");
            //calls the find() method from other class 
            DB.find();
        }
        //catch certain types of errors and replaces them with defined messages
        catch(IllegalArgumentException e) {
            //created message to display at error
            System.out.println("Invalid input " + e.getMessage());
        }
        //another error messgae execption
        catch(Exception e) {
            //invalild input eception
            System.out.println("Invalid input. Please Enter a whole no.\n");
            
        }//end of eception e
        
    } //end of main methon()     
}//end of class