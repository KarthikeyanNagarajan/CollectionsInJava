package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IterateHashMap {

	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("India","Delhi");
		hm.put("USA", "Washington");
		hm.put("USA", "Moscow");
		hm.put(null, "Colombo");
		hm.put(null, "Chennai");
		System.out.println(hm.get("India"));//Delhi
		System.out.println(hm.get("USA"));//Moscow
		System.out.println(hm.get("France"));//null
		System.out.println(hm.get(null));//Chennai
		
		System.out.println("-----");
		
		//1.Using keySet Iterator
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext())
		{
			System.out.print(hm.get(it.next()) + " ");
		}
		
		System.out.println("\n-----");
		
		//2.Using entrySet Iterator
		Iterator<Entry<String,String>> it1 = hm.entrySet().iterator();
		while(it1.hasNext())
		{
			Entry<String,String> entry = it1.next();
			System.out.print("key = " + entry.getKey() + "\t" + "value = " + entry.getValue() + "\n");
		}
		
		System.out.println("-----");
		
		//3.USing Java8 Stream
		hm.forEach((k,v) -> System.out.print("key = " + k + "\t" + "value = " + v + "\n"));

	}

}
