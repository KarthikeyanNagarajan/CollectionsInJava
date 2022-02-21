package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		h1.put(1, "A");
		h1.put(2, "B");
		h1.put(3, "C");
		HashMap<Integer,String> h2 = new HashMap<Integer,String>();
		h2.put(1, "A");		
		h2.put(3, "C");
		h2.put(2, "B");
		HashMap<Integer,String> h3 = new HashMap<Integer,String>();
		h3.put(1, "A");
		h3.put(2, "B");
		h3.put(3, "C");
		h3.put(3, "D");
		//1.Compare key and values
		System.out.println(h1.equals(h2));//true
		System.out.println(h1.equals(h3));//false
		
		System.out.println("-----");
		
		//2.compare keys
		System.out.println(h1.keySet().equals(h2.keySet()));//true
		System.out.println(h1.keySet().equals(h3.keySet()));//true
		
		System.out.println("-----");
		//3.Find out extra keys
		//Combine the keys from both map using HashSet
		HashMap<Integer,String> h4 = new HashMap<Integer,String>();
		h4.put(1, "A");
		h4.put(2, "B");
		h4.put(3, "C");
		h4.put(4, "D");
		HashSet<Integer> combine = new HashSet<Integer>(h1.keySet());
		combine.addAll(h4.keySet());
		combine.removeAll(h1.keySet());
		System.out.println(combine);
		
		System.out.println("-----");
		
		//4.Compare by Values
		HashMap<Integer,String> h5 = new HashMap<Integer,String>();
		h5.put(1, "A");
		h5.put(2, "B");
		h5.put(3, "C");
		HashMap<Integer,String> h6 = new HashMap<Integer,String>();
		h6.put(4, "A");		
		h6.put(5, "B");
		h6.put(6, "C");
		HashMap<Integer,String> h7 = new HashMap<Integer,String>();
		h7.put(1, "A");
		h7.put(2, "B");
		h7.put(3, "C");
		h7.put(4, "C");
		//When Duplicates are not Present: using ArrayList		
		System.out.println(new ArrayList<>(h5.values()).equals(new ArrayList<>(h6.values())));//true
		System.out.println(new ArrayList<>(h5.values()).equals(new ArrayList<>(h7.values())));//false
		
		System.out.println("-----");
		
		//When Duplicates are Present: using HashSet
		System.out.println(new HashSet<>(h5.values()).equals(new HashSet<>(h6.values())));//true
		System.out.println(new HashSet<>(h5.values()).equals(new HashSet<>(h7.values())));//true

	}

}
