package sheridan;

import java.util.*;

public class Person{

    private String _firstName;
    private String _lastName;
    
 /*   
     public String calculateFullName(){
    
        String fullName = _firstName + " " + _lastName;
        return fullName;
    } 
 */
    
    public String calculateFormalFullName(){
    
        String fullName = _lastName + " , " + _firstName;
        return fullName;
    
    }
    
    public void setFirstName(String firstName){
    
        _firstName = firstName;
        
    }
    
    public void setLastName(String lastName){
    
        _lastName = lastName;
        
    }

    public static void main(String[] args){
        
        Person self = new Person();
        
        self.setFirstName("john");
        self.setLastName("Peters");
   
        
        String ffName = self.calculateFormalFullName();
    
        System.out.println(ffName);
    
    }


}