
package Sheridan;

public class Dog3 
{
    private String name; // Declaring Dog Name
    
    public void bigBark() // Declaring method bigBark
    {
        System.out.println(getName() + " says Woof! Woof!");
    }
    
    public void smallBark() // Declaring method smallBark
    {
        System.out.println(getName() + " says Yip! Yip!");
    }
    
    public void setName(String nameInput){ //Setter for Dog's Name
      name = nameInput;
    }
    
    public String getName() { // Gets Dog's Name
      return name;
    }
    
    
    public static void main(String[] args) 
    {/*
        Dog one = new Dog(); // Creates object one
        one.name = "Thor"; // One's name is Thor
        Dog two = new Dog(); // Creates object Two
        two.name = "Tiny";  // Two's name is Tiny
        one.bigBark(); // One is big barking
        two.smallBark(); // Two is small barking
       */
        
        Dog3 one = new Dog3(); // Creates object one
        //String name2 = "Jams";
        one.setName("Thor");
        System.out.println(one.getName());
        one.bigBark(); // One is big barking
        one.smallBark(); // One is big barking
        
        Dog3 two = new Dog3(); // Creates object Two
        two.setName("Tiny");  // Two's name is Tiny
        two.smallBark(); // Two is small barking
        two.bigBark(); // Two is small barking
        
    } 
}