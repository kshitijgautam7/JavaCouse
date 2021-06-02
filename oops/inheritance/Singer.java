package oops.inheritance;

public class Singer extends Person{

		public Singer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

		public void Sing(){
			
			System.out.println("Singer is singing.");
			
		}
		
		public void eat() {
			System.out.println("singer "+ name + " is eating");
		}
		public static void laughing() {
			System.out.println("singer is laughing");
			
			}
}
