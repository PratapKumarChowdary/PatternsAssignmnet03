package Question13;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> vectorList = new Vector<>();
        vectorList.add("ACS");
        vectorList.add("IS");
        
        System.out.println("Vector List: " + vectorList);
        
        List<String> arrayList = new ArrayList<>();
        arrayList.add("S555080");
        arrayList.add("Pratap");
        System.out.println("Array List: " + arrayList);
        
        
        Enumeration<String> vectorEnum = ((Vector<String>) vectorList).elements();
        System.out.print("Vector List Iteration (using Enumeration Concept): ");
        while (vectorEnum.hasMoreElements()) {
            System.out.print(vectorEnum.nextElement() + " ");
        }
        System.out.println();
        
        
        Iterator<String> arrayIterator = arrayList.iterator();
        System.out.print("Array List Iteration (using Iterator): ");
        while (arrayIterator.hasNext()) {
            System.out.print(arrayIterator.next() + " ");
        }
        System.out.println();



	}

}
