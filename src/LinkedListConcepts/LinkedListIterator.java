package LinkedListConcepts;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("abc");
		ll.add("lmn");
		ll.add("pqr");
		ll.add("xyz");
		
		Iterator<String> it1 = ll.iterator();
		while(it1.hasNext())
		{	
			System.out.println(it1.next());
		}	
		
		System.out.println("-----");
		
		Iterator<String> it2 = ll.descendingIterator();
		while(it2.hasNext())
		{	
			System.out.println(it2.next());
		}

	}

}
