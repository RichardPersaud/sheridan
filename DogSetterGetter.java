
//991561952  Yewon Lee
package sheridan; 
public class DogSetterGetter { 
    public String name;
    
    public void bigBark() {
        System.out.println(" says Woof! Woof!"); 
    }
    public void smallBark() { 
        System.out.println(" says Yip! Yip!"); 
    }
    
   // teachers instruction
   public void setName(String strName) {
        
        name = strName;
    }
    
    public String getName ()
    {
        return name;
    } 
  
    /* my try 
    private String one;
    private String two;
    
    public void setOne (String Thor) {
        one = Thor;
    }
    public void setTwo (String Tiny) {
        two = Tiny;
    }
    public String getOne() {
        return one;

    }
    public String getTwo() {
        return two;
    
    } 
    */
    
    
    public static void main(String[] args) { 
        
         One.setName ("Thor");
         One.setName ("Tiny");
        
        DogSetterGetter One = new DogSetterGetter(); 
        one.bigBark(); two.smallBark(); }//
} // End of class Dog