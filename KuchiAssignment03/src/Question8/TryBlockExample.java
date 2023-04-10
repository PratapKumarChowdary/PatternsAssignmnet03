package Question8;

public class TryBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("From Try Block");
			
			//Exception Thrown here
			int a = 10/0;
			
			
		}finally {
			System.out.println("From Finally Block");
		}

	}

}
