package Question25;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(5);
        numbers.add(1);
        numbers.add(8);
        numbers.add(3);

        // Example of using Stream 
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);

      
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of all elements: " + sum);

        
        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
        System.out.println("Max element: " + max);
    }
}
