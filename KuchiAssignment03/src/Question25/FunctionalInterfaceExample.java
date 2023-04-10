package Question25;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FunctionalInterfaceExample {
	
    public static void main(String[] args) {

	
	List<String> strings = Arrays.asList("Pratap", "NTR", "RRR", "Movie");
	
	Collections.sort(strings, (String s1, String s2) -> s1.compareTo(s2));
    System.out.println("Sorted strings: " + strings);
    }

}
