package oops;
	class Vehicle {
		
		int wheels;
		String color;
		int headLigits;
		Vehicle() {
			this.wheels = wheels;
			headLigits = 2;
			
		}
		Vehicle(int wheels, String color) {
			this.wheels = wheels;
			this.color = color;
			headLigits = 2;
		}
	}
	
		
public class MyConstructor {
	
	MyConstructor(){
		System.out.println("Object is now created");
	}
	public static void main(String[] args) {
			
//		MyConstructor obj = new MyConstructor();  //creating object
			
				Vehicle car = new Vehicle();
				Vehicle scooty = new Vehicle();
				
				Vehicle bmw = new Vehicle(4, "white");
				System.out.println(bmw.wheels +" wheels " +bmw.color + " color" );
	}

}
