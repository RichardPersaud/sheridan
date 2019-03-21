package sheridan;
public class DogMutatorMethod{
    
    private String newName;
     
    public void setName(String newName){
         newName = newName;
    }
    
     public void getName() {
       return firstName;
    }
    
    public static void main(String[] args) {
        DogMutatorMethod one = new DogMutatorMethod();
        one.newName = "Thor";
        DogMutatorMethod one = new DogMutatorMethod();
        one.newName = "Tiny";
        
       System.out.println(newName);
    }
} // End of class Dog