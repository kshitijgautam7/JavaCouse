package oops;

class Cat {
	
	boolean hasFur;
	String color, breed;
	int eyes, legs;
	
	public void walk() {
		System.out.println("Cat is walking");
	}
	public void eat() {
		System.out.println("Cat is eating");
		
	}
}

class Dog {
	String breed, name;
	
	public void jump() {
		System.out.println("My dog " + name + " will jump");
	}
	
	public void description() {
		System.out.println("My dog name is " +name+ " and my dog breed is " +breed);
	}
}
public class MainClass {

	public static void main(String[] args) {
	
//		Cat cat1 = new Cat();
//		Cat cat2 = new Cat();
//		
//		cat1.walk();
//		cat2.eat();
		
		Dog huskey = new Dog();
		Dog poodle = new Dog();
		
		huskey.breed = "huskey";
		huskey.name = "Browny";
		
		poodle.breed = "poodle";
		poodle.name = "moodle";
		
		huskey.jump();
		huskey.description();
		
		poodle.jump();
		poodle.description();
	}

}






//How to create object of a class?

/* ClassName objectName = new ClassName();

	eg:- 
		Phone onePlus7 = new Phone();
		Phone iPhone11 = new Phone();
*/
