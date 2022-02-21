package LinkedListConcepts;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("abc");
		ll.add("lmn");
		ll.add("pqr");
		ll.add("xyz");
		System.out.println(ll);// [abc, lmn, pqr, xyz]
		System.out.println(ll.size());// 4
		System.out.println(ll.get(1));// lmn
		ll.add(1,"efg");
		System.out.println(ll);// [abc, efg, lmn, pqr, xyz]
		
		LinkedList<String> Subll = new LinkedList<String>();
		Subll.add("aaa");
		Subll.add("zzz");
		ll.addAll(Subll);	
		System.out.println(ll);// [abc, efg, lmn, pqr, xyz, aaa, zzz]
		
		ll.addFirst("a1");
		System.out.println(ll);// [a1, abc, efg, lmn, pqr, xyz, aaa, zzz]
		ll.addLast("z1");
		System.out.println(ll);// [a1, abc, efg, lmn, pqr, xyz, aaa, zzz, z1]
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);// [abc, efg, lmn, pqr, xyz, aaa, zzz]
		ll.remove(1);
		System.out.println(ll);// [abc, lmn, pqr, xyz, aaa, zzz]
		ll.removeAll(Subll);
		System.out.println(ll);// [abc, lmn, pqr, xyz]	
		Collections.sort(ll);
		System.out.println(ll);// [abc, lmn, pqr, xyz]
	}

}
