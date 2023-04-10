package Question15;

import java.util.HashMap;
import java.util.Hashtable;

public class MapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> hashTable = new Hashtable<>();
        hashTable.put(1, "Iphone");
        hashTable.put(2, "Laptop");
        hashTable.put(3, "Airpods");
      //  hashTable.put(null, "null"); // throws NullPointerException
      //  hashTable.put(4, null); // throws NullPointerException
        System.out.println("Hashtable: " + hashTable);

     
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "RRR");
        hashMap.put(2, "NTR");
        hashMap.put(3, "NBK");
        hashMap.put(null, "null"); // allowed
        hashMap.put(4, null); // allowed
        System.out.println("HashMap: " + hashMap);
	}

}
