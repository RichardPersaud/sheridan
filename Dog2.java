package sheridan;

import java.util.*;

public class Dog2{

        public String name; // Declaring Dog Name
    
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