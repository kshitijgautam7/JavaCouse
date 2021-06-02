package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
	
		List<String> fruits = new LinkedList();
		List<String> vege = new ArrayList();
			fruits.add("Apple");
			fruits.add("Orange");
			fruits.add("Hi");
	
			
//			vege.add("Potato");
//			vege.add("Tomato");
//			vege.add("Spinach");

//			Pair<String, Integer> p1 = new Pair("Kshitij" , 7);
//			Pair<Boolean, Character> p2 = new Pair(true , 'F');
//			
//			p1.getDescription();
//			p2.getDescription();
			
//			fruits.addAll(vege);
			
//			fruits.set(0, "strawberry");
//			fruits.remove(2);	
//			fruits.clear();
			
//			List<String> toRemove = new ArrayList();
//			toRemove.add("Orange");
//			toRemove.add("Hi");
//			
//			fruits.removeAll(toRemove);
			
//			fruits.size();
//			System.out.println(fruits.contains("Hi"));
//			System.out.println(fruits);
			
			//to array (imp)
			
//			Object x[]= fruits.toArray();
			
			String temp[] = new String[fruits.size()];
			fruits.toArray(temp);
			
			for(String e: temp) {
				System.out.println(e);
				
			}

	}
}