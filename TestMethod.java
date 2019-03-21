package sheridan;

import java.util.*;

public class TestMethod{
    
    public double Example(double x, double y){
    
        return x + y;
        
    }

    public static void main(String[] args){
        
        TestMethod self = new TestMethod();
        
        System.out.println(self.Example(2.0, 3.0));
        
    }

}