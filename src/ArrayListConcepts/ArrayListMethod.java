package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethod {

	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("java","python","javascript"));		
		ArrayList<String> ar2 = new ArrayList<String>(Arrays.asList("testing","devops"));		
		//ar1.addAll(ar2);
		//System.out.println(ar1); //[java, python, javascript, testing, devops]
		//ar1.addAll(2,ar2);
		//System.out.println(ar1);//[java, python, testing, devops, javascript, testing, devops]
		//ar1.clear();
		//System.out.println(ar1);//[]
		ArrayList<String> cloneList = (ArrayList<String>) ar1.clone();
		System.out.println(cloneList);
		
		System.out.println(ar1.contains("python"));//true
		System.out.println(ar1.contains("c++"));//false
		System.out.println(ar1.indexOf("javascript"));//2
		
		ArrayList<String> ar3 = new ArrayList<String>(Arrays.asList("java","python","java","C","python"));
		System.out.println(ar3.lastIndexOf("java"));//2
		ar3.remove(1);
		System.out.println(ar3);//[java, java, C, python]
		ar3.remove("C");
		System.out.println(ar3);//[java, java, python]
		
		ArrayList<Integer> ar4 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		ArrayList<Integer> ar5 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		ar4.removeIf(num -> num % 2==0);//[1, 3, 5, 7, 9] //odd numbers
		System.out.println(ar4);
		ar5.removeIf(num -> num % 2!=0);//[2, 4, 6, 8] //even numbers
		System.out.println(ar5);
		
		ArrayList<String> ar6 = new ArrayList<String>(Arrays.asList("java","python","java","C","python"));
		ar6.retainAll(Collections.singleton("java"));
		System.out.println(ar6);//[java, java]
		
		ArrayList<Integer> ar7 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		ArrayList<Integer> sublist = new ArrayList<Integer>(ar7.subList(2, 5));
		System.out.println(sublist);//[3, 4, 5]
	}

}
