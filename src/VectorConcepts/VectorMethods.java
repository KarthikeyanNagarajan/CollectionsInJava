package VectorConcepts;

import java.util.Collections;
import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(9);
		v.add(1);
		v.add(7);
		v.add(3);
		System.out.println(v);// [5, 9, 1, 7, 3]
		System.out.println(v.get(2));// 1
		v.remove(1);
		System.out.println(v);// [5, 1, 7, 3]
		
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(7);
		v1.add(10);
		v.addAll(v1);
		System.out.println(v);// [5, 1, 7, 3, 7, 10]
		
		Collections.sort(v);
		System.out.println(v);// [1, 3, 5, 7, 7, 10]
	}

}
