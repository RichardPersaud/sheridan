// Richard Persaud

package sheridan; // from sheridan directory

import java.util.*; // importing java utility files

public class RectangleMaker{// class RectangeMaker
    
    //initializing and assigning
   private int height = 0;
   private int width = 0;
   private String value = ""; // default set null
   
   
   // mutator method to use private varibales in same class
   public void setHeight(int Height){
       this.height = Height; // assigning this.height
   }
   
   // mutator method to use private varibales in same class
   public void setWidth(int Width){
       this.width = Width; //assigning this.width
   }
   
   
   public void setValue(String Value){
       this.value = Value; //assigning this.value
   }

    public static void main(String[] args){
// requirements that was given to solve
//     System.out.println("5 x 3 rectangle made of the letter ‘O’ \n");            
//     System.out.println("16 x 6 rectangle made of the letter ‘T’ \n");
// System.out.println("2 x 4 rectangle made of the left square bracket ‘%' \n");      
        

//initializing and creating obj as an object
          RectangleMaker obj = new RectangleMaker();
          
          //assigning data to the width and height
          obj.width = (5);
          obj.height = (3);
          obj.value = "0";
          
            //calling the method after declaring the desired size 
         obj.calculate(obj.height, obj.width, obj.value); 
         
         
         System.out.println();
         
         //assigning data to width and height
         obj.width = (16);
          obj.height = (6);
          obj.value = "T";
       
            //calling the method after declaring the desired size 
         obj.calculate(obj.height, obj.width, obj.value);
         
    
          System.out.println();
          
          //assigning data to width and height
          obj.width = (2);
          obj.height = (4);
          obj.value = "%";
    
            //calling the method after declaring the desired size 
         obj.calculate(obj.height, obj.width, obj.value);
       
   } 
   
   
   //calculate method that does the work for main method
   public void calculate(int height, int width, String value){// initializing
  //for as long as "i" is less than or equal to height ...increment by 1
      for (int i = 1; i <= this.height; i++){
          
            System.out.println();
  // for as long as "a" is less than or equal to width ...increment by 1
            for (int a = 1; a <= this.width; a++){
                 
                System.out.print(this.value);
            }
        }    
   }
 
}








