package Question9;

import java.util.Scanner;

public class TryResourceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try (Scanner scanner = new Scanner(System.in)) {
	            System.out.print("Enter your name: ");
	            String name = scanner.nextLine();
	            System.out.println("Hello, " + name + "!");
	        }

	}

}
