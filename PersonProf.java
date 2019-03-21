package sheridan;

public class PersonProf
{
    private String _firstName;
    private String _lastName;
    
    public String calculateFullName() {
        String fullName = _firstName + " " + _lastName;
        return fullName;
    }
    
    public String calculateFormalFullName() {
        String fullName = _lastName + ", " + _firstName;
        return fullName;
    }
    
    public void setFirstName(String firstName) { // setter for firstname
        _firstName = firstName;
    }
    public void setLastName(String lastName) { //setter for lastname
        _lastName = lastName;
    }
    
    public static void main(String[] args) {
        
        PersonProf p1 = new PersonProf();
        
        p1.setFirstName("John");
        p1.setLastName("David");
        
        String ffName = p1.calculateFormalFullName();
        
        System.out.println(ffName);
        
    }
}