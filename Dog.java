//Richard Persaud ID: 991535224

package sheridan;
public class Dog {
    public String name;
    
    public void bigBark() {
        System.out.println(name + " says Woof! Woof!");
    }
    public void smallBark() {
        System.out.println(name + " says Yip! Yip!");
    }
    
    public static void main(String[] args) {
        
        Dog one = new Dog();
        one.name = "Thor";
        
        Dog two = new Dog();
        two.name = "Tiny";
        
        one.bigBark();
        two.smallBark();
    }
} // End of class Dog