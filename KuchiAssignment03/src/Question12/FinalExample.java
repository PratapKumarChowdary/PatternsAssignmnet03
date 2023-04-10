package Question12;

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Example of final
		// Declaring a final variable
		final int number = 10; 		
		
		
		
		// Example of try-catch-finally
		try {
			System.out.println("Try Block");
		}finally {
			System.out.println("From Block");
		}

		// Example of finalize
		MyClass myClass = new MyClass();
		myClass = null; // Making the object eligible for garbage collection
		System.gc(); // This will call the finalize method of MyClass
	}

}
class MyClass {
	// Example of finalize
	protected void finalize() throws Throwable {
		System.out.println("MyClass object is destroyed and cleaned up here");
	}
}


