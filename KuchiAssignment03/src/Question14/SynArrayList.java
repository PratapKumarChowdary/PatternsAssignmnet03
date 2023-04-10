package Question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Collections.synchronizedList(new ArrayList<String>());

		list.add("Pratap");
		list.add("Eswar");
		list.add("Kumar");

		synchronized(list)
		{

			Iterator it = list.iterator();

			while (it.hasNext())
				System.out.println(it.next());
		}

		CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<String>();
		threadSafeList.add("From CopyWriteArrayList");
		threadSafeList.add("Pratap");
		threadSafeList.add("Kumar");


		System.out.println("Elements of synchronized ArrayList 2 :");
		Iterator<String> it = threadSafeList.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
