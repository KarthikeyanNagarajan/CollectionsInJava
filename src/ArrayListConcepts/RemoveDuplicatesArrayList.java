package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesArrayList {

	public static void main(String[] args) {	
		
	//1. Using LinkedHashSet
	ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(1,1,2,4,3,3,8,8,6,7,5,9));
	LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(ar1);	
	ArrayList<Integer> arr1 = new ArrayList<Integer>(set);
	System.out.println(arr1);
	
	//2. Using Java8 stream
	ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(1,1,2,4,3,3,8,8,6,7,5,9));
	List<Integer> ls = ar.stream().distinct().collect(Collectors.toList());
	System.out.println(ls);
	}
}
