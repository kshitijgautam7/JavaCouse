package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
//		Set<String> fruits = new LinkedHashSet<>(); 
		// LinkedHashSet  ---> order(sequence) of element remain same as input 
		
//		Set<String> fruits = new TreeSet<>(); 
        // TreeSet ---> elements in sorted order
//		fruits.add("Banana");
//		fruits.add("Apple");
//		fruits.add("Kiwi");
//	
//		System.out.println(fruits);
		
		Set<Integer> x = new HashSet<>();
		x.add(23);
		x.add(15);
		x.add(1);
		
		Set<Integer> y = new HashSet<>();
		y.add(15);
	
		
//		x.addAll(y);  //union
//		x.retainAll(y); //intersection
		
		System.out.println(x.containsAll(y)); //subset
		System.out.println(x);
	}

}
 