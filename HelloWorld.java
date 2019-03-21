package sheridan;

import java.util.*;

public class HelloWorld{

    private String emailAddress;
    
    public String getEmailAddress(){
        return emailAddress;
    }
    
    public void setEmailAddress(String email){
        
        
    int x =0;
        if(x == 0){
        
            this.emailAddress = email;
        }else{
            System.out.println("Email address in invalid.");
        }
    
    }

}