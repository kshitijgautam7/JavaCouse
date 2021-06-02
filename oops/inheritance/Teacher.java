package oops.inheritance;

public class Teacher extends Person{

		public Teacher(String name) {
			super(name);
		}
		public void teach() {
			System.out.println(name + " is teaching");   //object related
		}
		

		public void eat() {
			super.eat();
			System.out.println("teacher "+ name + " is eating");  //object relatred
		}
		
		public static void laughing() {
			System.out.println("teacher is laughing");     //class related
			
			}

}
