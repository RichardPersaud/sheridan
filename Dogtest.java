package sheridan;

import java.util.*;

public class Dogtest{

        public static void main(String[] args) 
    {
        
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