package Question3;

public class Mammal extends Animal{
	
	@Override
    public Mammal reproduce() {
        System.out.println("From Mammal Class reproducing...");
        return new Mammal();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Mammal();
		// calls the overridden reproduce method in Mammal
        Animal newAnimalObj = a.reproduce(); 
        System.out.println("Type of new animal: " + newAnimalObj.getClass().getSimpleName());

	}

}
