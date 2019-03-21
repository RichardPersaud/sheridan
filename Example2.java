package sheridan;

import java.util.*;

public class Example{

    public static void main(String[] args){
    
        HelloWorld myObject = new HelloWorld();
        myObject.setEmailAddress("richrd@sdsd.com");
        
        System.out.println(myObject.getEmailAddress());
        
    }
    
}


package sheridan;

import java.util.*;

public class HelloWorld{

    private String emailAddress;
    
    public String getEmailAddress(){
        return emailAddress;
    }
    
    public void setEmailAddress(String email){
    
        if(email.indexOf("@") != -1){
        
            this.emailAddress = email;
        }else{
            System.out.println("Email address in invalid.");
        }
    
    }

}