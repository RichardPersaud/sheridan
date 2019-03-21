import java.util.Scanner;

public class FindCurrent2{
    public static void main(String args[]){
        
        double res; double vol; double cur;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Resistance");
        res = input.nextDouble();
        System.out.println("Enter Voltage");
        vol = input.nextDouble();
        
        FindCurrent2 self = new FindCurrent2();
        
        
        System.out.println("Row"+"  "+"Voltage"+"  "+"Resistance"+"  "+"Current");
        
        
        for(int loop = 1; loop <= 30; loop++){
            System.out.print(loop+".");
            
            cur = self.calculateCurrent(res,vol);
            
            System.out.print("  "+ vol);
            System.out.print("  "+ res);
            System.out.println("  "+ cur);
            res = res +10;
            vol = vol +5;
        }
        
    }
    
    public double calculateCurrent(double res, double vol){
        double cur = 0.0;
        
        cur = res/vol;
        
        return cur;
    }
}