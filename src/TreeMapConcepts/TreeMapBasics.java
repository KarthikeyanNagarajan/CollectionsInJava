package TreeMapConcepts;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapBasics {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(5, "Five");
		tm.put(3, "Three");
		tm.put(7, "Seven");
		tm.put(1, "One");
		System.out.println(tm);//{1=One, 3=Three, 5=Five, 7=Seven}
		tm.forEach((k,v) -> System.out.println("Key = " + k + "\tValue = " + v));
		
		System.out.println(tm.lastKey());// 7
		System.out.println(tm.firstKey());// 1
		
		Set<Integer> keyLessThan5 = tm.headMap(5).keySet();
		System.out.println(keyLessThan5);//[1, 3]
		Set<Integer> keyGretThan5 = tm.tailMap(5).keySet();
		System.out.println(keyGretThan5);//[5, 7]
		
		TreeMap<Integer,String> tm1 = new TreeMap<Integer,String>(Comparator.reverseOrder());
		tm1.put(5, "Five");
		tm1.put(3, "Three");
		tm1.put(7, "Seven");
		tm1.put(1, "One");
		System.out.println(tm1);//{7=Seven, 5=Five, 3=Three, 1=One}	
	}

}
