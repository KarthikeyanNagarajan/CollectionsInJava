package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
		
		//1.Using For Loop
		for(int i=0; i<ar.size(); i++)
		{
			System.out.print(ar.get(i)+" ");
		}
		
		System.out.println("\n-----");
		
		//2.Using ForEach Loop
		for(String s : ar)
		{
			System.out.print(s+" ");
		}
		
		System.out.println("\n-----");
		
		//3.Using Iterator
		Iterator<String> it = ar.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println("\n-----");
		
		//4.Using Java8 Stream
		ar.stream().forEach(s -> System.out.print(s+" "));
	}

}
