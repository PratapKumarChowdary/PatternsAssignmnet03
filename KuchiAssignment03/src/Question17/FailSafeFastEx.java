package Question17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;



public class FailSafeFastEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fail Safe example
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 2, 3, 5 });
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Integer no = (Integer)itr.next();
			System.out.println(no);
			if (no == 5)
				list.add(14);
		}
		
		// Fail Fast Example
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(4);
		aList.add(5);
  
        Iterator<Integer> itr1 = aList.iterator();
        while (itr1.hasNext()) {
            if (itr1.next() == 2) {
              // Throws Exception hereS
                itr1.remove();
            }
        }
  
        System.out.println(aList);
  
        itr1 = aList.iterator();
        while (itr1.hasNext()) {
            if (itr1.next() == 3) {
                a
            	aList.remove(3);
            }
        }
	}

}
