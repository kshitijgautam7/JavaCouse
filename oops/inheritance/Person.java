package oops.inheritance;

public class Person {

	protected String name;
	
	 public Person(String name) {
		 this.name = name;
		 
		 System.out.println("Inside person Constructor");
	 }
	 
	public void walk() {
		System.out.println("person " + name + " is walking");
		
		}
	
	public void eat() {
		System.out.println("person " + name +" is eating");  //object related
		
		}
	

	public static void laughing() {
		System.out.println("person is laughing");         //class related
		
		}
}
