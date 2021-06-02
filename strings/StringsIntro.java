package strings;

public class StringsIntro {

	public static void main(String[] args) {

//		String Intro
//		
//		/*String 2 comp = i)String pool Area ii)Heap Area	
//		  Strings are immutable (Cannot change) */
//		
		String name1 = "Kshitij"; //USING LITERALS (Uses string pool area)
		String name2 = "Kshitij";
		String anotherName = new String ("Kshitij"); //Creates a string in Heap Area
		
		
		System.out.println(name1 == name2);
		System.out.println(name1 == anotherName);
		
/*		IMP INTERVIEW QUE
 * QUE -> WHEN WE INSTALISE A STRING USING NEW HOW MAY String's are made
 * ANS -> 2 (1 in heap, 1 in String pool). 
 */ 
 
//		String cars = "Audi,BMW,Rolls Royce,RANGE ROVER";
//		String allCars[] = cars.split(",");
//		String name = "   Anuj   ";
//		for (String car: allCars) {
//		System.out.println(cars.indexOf('Y'));
//		System.out.println(cars.indexOf('Z'));		
//		System.out.println(cars.toUpperCase());
//		System.out.println(cars.toLowerCase());
//		System.out.println(name + "  " + name.trim());
//		System.out.println(name.trim());
//			System.out.println(car);
//		    
//		}
	}

}
