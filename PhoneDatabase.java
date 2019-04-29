// Name:Richard Persaud ID:991535224
// Simple Table DataBase java Assignment #4

package sheridan; // folder as package
import java.util.*; // java utility liburary imported

//Defining class PhoneDatabase as public
public class PhoneDatabase{
    
    //Initializing pivate field variables;
    private int TB_size;
    private String[] table;
    private String temp;
    
    // getAdd function to be used in main method
    public void getAdd(){
        
        //Scanner accepts user input
        Scanner input = new Scanner(System.in);
        //Storing user input to TB_size for table
        TB_size = input.nextInt();
        String[] index = new String[TB_size];
        
        table = index;//replace with table
        
        //Prints table Size given
        System.out.println("Table Size Is: "+TB_size);
        
        //for loop run for table size
        for(int i = 0; i < TB_size; i++){
            
            //Asks for table entries
            System.out.println("Enter Index Table Details:");
            System.out.print(i+1+" >"); // Table number 
            
            table[i] = input.next();// Table Array input
            
        }
        
        System.out.print("\n");//spacer
        //Displays the table size and tabel entries
        System.out.println("Your "+TB_size+" Index Values Are:\n \n" +
                           Arrays.toString(table));
        
    }//end of getAdd()
    // Sorting fuction to sort alphabetically
    public void sort(){
        
        Arrays.sort(table);//makes life easy
        //prints the sorted table array to string 
        System.out.println(Arrays.toString(table));
    }//end of sort()
    
    //Searching function to find entry data
    public void find(){
        //Scanner function
        Scanner in = new Scanner(System.in);
        
        //created infinite loop to keep searching table data
        int user = 0;
        //as long as user is 0 it loops 
        while(user <= 0){
            String find = in.nextLine();
            //Displays the results of the search
            System.out.println("\n ....Results:....");
            for (int i = 0; i < TB_size; i++){
                System.out.print(table[i] + " - ");//Display entery /spacer
                //if condition /true
                if(table[i].contains(find)) {  
                    System.out.println("Found");  //entry found
                }else  //else /false
                    System.out.println("Result not found"); //entry not found      
            }//spacer
            System.out.println("\n....................................\n");
            System.out.print("Search for");//ask to re-search table database
        }//end of while loop
        
    }//end of find()
}//end of class

