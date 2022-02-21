package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeArrayList {

	public static void main(String[] args) {
		
		//1. Using Collections.synchronizedList
		// For add,remove we don't need explicit synchronized (using synchronized keyword)
		// For fetch/traverse we need explicit synchronized in case of multithread
		List<String> ar = Collections.synchronizedList(new ArrayList<String>());
		ar.add("abc");
		ar.add("pqr");
		ar.add("xyz");
		synchronized (ar) {
			Iterator<String> it = ar.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		System.out.println("-----");
		//2. Using copyOnWriteArrayList
		// It is a class: Already Synchronized
		// We don't need explicit synchonization for add/remove/fetch/traverse
		CopyOnWriteArrayList<String> arr = new CopyOnWriteArrayList<String>();
		arr.add("abc");
		arr.add("pqr");
		arr.add("xyz");
		Iterator<String> it = arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
