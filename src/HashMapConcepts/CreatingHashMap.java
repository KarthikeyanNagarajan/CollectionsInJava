package HashMapConcepts;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingHashMap {
	static HashMap<String,String> hs3;
	static {
		hs3 = new HashMap<String,String>();
		hs3.put("a", "A");		
	}
	

	public static void main(String[] args) {
		//1.Using HashMap class
		HashMap<String,String> hs1 = new HashMap<String,String>();
		Map<String,String> hs2 = new HashMap<String,String>();
		
		//2.Static HashMap
		System.out.println(CreatingHashMap.hs3.get("a"));
		
		System.out.println("-----");
		
		//3.Immutable Hashmap
		//If we add other k,v then we will get UnsupportedOperationException
		Map<String,String> hs4 = Collections.singletonMap("b", "B");
		System.out.println(hs4.get("b"));
		
		System.out.println("-----");
		
		//4.Java8 Stream - 2D Array
		Map<String,String> hs5 = Stream.of(new String[][] {
			{"c","C"},{"d","D"}
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(hs5.get("c"));
		
		System.out.println("-----");
		
		//5.Java8 Stream - SimpleEntry		
		Map<String,String> hs6 = Stream.of(
				new AbstractMap.SimpleEntry<>("e","E"),
				new AbstractMap.SimpleEntry<>("f","F")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(hs6.get("e"));

	}

}
