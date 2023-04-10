package Question16;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Map<String, Integer> hashMap = new HashMap<>();


		hashMap.put("apple", 1);
		hashMap.put("banana", 2);
		hashMap.put("cherry", 3);


		int value = hashMap.get("cherry");
		System.out.println("The value of cherry is: " + value);


		boolean containsKey = hashMap.containsKey("apple");
		System.out.println("The hash map contains the key 'apple': " + containsKey);

		hashMap.remove("cherry");
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			String key = entry.getKey();
			int value1 = entry.getValue();
			System.out.println(key + ": " + value1);
		}
	}

}


