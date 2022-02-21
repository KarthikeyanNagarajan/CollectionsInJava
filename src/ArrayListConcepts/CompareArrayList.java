package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList {

	public static void main(String[] args) {
		
		//1.Check if 2 ArrayList is same
		ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("A","B","D","E","C"));
		ArrayList<String> ar2 = new ArrayList<String>(Arrays.asList("A","B","D","F","C"));
		ArrayList<String> ar3 = new ArrayList<String>(Arrays.asList("A","B","D","E","C"));
		Collections.sort(ar1);
		Collections.sort(ar2);
		Collections.sort(ar3);
		System.out.println(ar1.equals(ar2));//false
		System.out.println(ar1.equals(ar3));//true

		System.out.println("-----");
				
		//2.Find Missing Elements
		ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList("A","B","D","E","C"));
		ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList("A","B","D","F","C"));
		arr1.removeAll(arr2);
		System.out.println(arr1);//E
		
		ArrayList<String> arr3 = new ArrayList<String>(Arrays.asList("A","B","D","E","C"));
		ArrayList<String> arr4 = new ArrayList<String>(Arrays.asList("A","B","D","F","C"));
		arr4.removeAll(arr3);
		System.out.println(arr4);//F
		
		System.out.println("-----");
		
		//3.Find Common Elements
		ArrayList<String> ls1 = new ArrayList<String>(Arrays.asList("A","B","D","E","C"));
		ArrayList<String> ls2 = new ArrayList<String>(Arrays.asList("A","B","D","F","C"));
		ls1.retainAll(ls2);
		System.out.println(ls1);//A,B,D,C
		
	}

}
