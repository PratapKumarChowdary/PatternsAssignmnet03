package Question4;

public class Dog extends Animal{
	
	
	
     void makeSound() {
        System.out.println("Dog is barking.");
    }
    
    
    
    private void breathe() {
        System.out.println("Dog is panting.");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Animal a = new Dog();
	        a.makeSound(); // calls the makeSound method in Animal

	}

}
