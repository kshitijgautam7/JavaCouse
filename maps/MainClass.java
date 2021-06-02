package maps;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		
//		Map<String, Integer> numbers = new HashMap<>();
 
//		numbers.put("one", 1);
//		numbers.put("three", 3);
//		numbers.put("five", 5);
//		
//		numbers.remove("three" ,3);
//		
//		System.out.println(numbers);
//		System.out.println(numbers.keySet());
//		System.out.println(numbers.values());
//		System.out.println(numbers.entrySet());
//		
//		Set<Entry<String, Integer>> entries = numbers.entrySet();		
//		for(Entry<String, Integer> entry: numbers.entrySet()) {
//		entry.setValue(entry.getValue() * 100);
//	}
//		System.out.println(numbers);
		System.out.println(getHash("DOG"));  //ASCII FOR A --> 65 , C-->67  So, HASH OF CAT = 65+67+..
	}
	
	public static int getHash (String s) {
		int hash = 0;
		for(int i=0; i<s.length(); i++) {
			hash += s.charAt(i);
		}
	
	return hash;
}
}