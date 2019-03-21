public class ProgramV
{
// The mathematical constant Pi
// Note: 'static' is needed here to use it from main method
    private double pi;
    
    
    public static void main(String[] args)
    {
        //helloOne();  //if its static
        
        //creating object varibale from the same class
        ProgramV self = new ProgramV();
        
        //call method using self object
        self.helloOne();
        //self.helloTwo();
        
        //self.addTwoNumbers();
        
        /**comments */
        
        
    }
    
    public void helloOne() {
        // This writes a message to the screen
        System.out.println ( "Hello Pi Program" );
        pi = 355.0 / 113.0;
        System.out.println ( "Pi is about " + pi );
        
        int value = 12;
        value = value * (3/2);
        value = value % 2;
        value = value -11;
        value = value / 3;
            System.out.println("The result = " +value);
        
        helloTwo();//calling the other method
        int result = addNumbers(10,20);
        
        System.out.println("The result = " + result);
        
    }
    
    public void helloTwo() {
        
        double multiplier = 2;
        double twoPi = multiplier * pi;
        System.out.println ( "Two Pi is about " + twoPi );
        
        double fourPi = twoPi * multiplier;
        System.out.println ( "four PI is about " + fourPi);
        
    }
    
    public void addTwoNumbers(){
        //decaration part
        int a = 10;
        int b = 9;
        
        //processing part
        int result = a + b;
        System.out.println("result of adding " + a + " to " + b + " is " + result);
        
    }
    
    public int addNumbers(int num1, int num2)
    {
        num1 = 5;
        num2 = 6;
        return num1 + num2;
    }
}