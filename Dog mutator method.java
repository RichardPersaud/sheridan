package sheridan;
public class Dog mutator method{
    
    public String name;
    
    public void getName() {
       return name;
    }
    
    public void setName(String newName){
         this.name = newName;
    }
    
    public static void main(String[] args) {
        
        Dog one = new Dog();
        this.name = "Thor";
        
        Dog two = new Dog();
        this.name = "Tiny";
        
       System.out.println(name);
    }
} // End of class Dog