package Question2;

public class Subclass extends Superclass {
    // This is a valid override of the publicMethod in Superclass
//    private void publicMethod() {
//        System.out.println("This is a private method in the subclass.");
//    }
    
    // This is a valid override of the protectedMethod in Superclass
    public void protectedMethod() {
        System.out.println("This is a public method in the subclass.");
    }
    
    // This is a valid override of the defaultMethod in Superclass
    public void defaultMethod() {
        System.out.println("This is a public method in the subclass.");
    }
    
    // This is NOT an override of the privateMethod in Superclass
    public void privateMethod() {
        System.out.println("This is a public method in the subclass.");
    }
}