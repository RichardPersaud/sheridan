package sheridan;

import java.util.*;

public class RectangleMaker2{
    
    private int width;
    private int height;
    private String value;

    
    public void setWidth(int width)
    {
      width = width;
    }
    
    public void setHeight(int height)
    {
        height = height;
    } 
 
    public void setValue(String newValue)
    {
       value = newValue;
    }
    
   public void rect(int height,int width,String value){
       for (int i=1;i <= height;i++){//loop to creat the rectangle of desired size
            System.out.println();
            for (int l=1;l <= width;l++){
                System.out.print(value);
            }
        }    
    
   public static void main(String[] args){
        
        
       RectangleMaker2 self = new RectangleMaker2();
       
       
        System.out.println("A 5 x 3 rectangle made of the letter ‘O’ \n");            
        System.out.println("A 16 x 6 rectangle made of the letter ‘T’ \n");
        System.out.println("A 2 x 4 rectangle made of the left square bracket ‘% \n");
        
        
        self.height=3;
        self.width=5;
        self.value="0";
        //calling the method after declaring the desired size 
        self.rect(self.height, self.width, self.value);
 
       self.setWidth(5);
       int width = self.setWidth();
        self.value="0";
        //calling the method after declaring the desired size 
         self.rect(self.height, self.width, self.value);
       
        self.setHeight(3);
       int height = self.setHeight(); 
       
        
        System.out.println(" ");
      
    }
    
   }
    
}





