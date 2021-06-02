package oops.abstraction;

public class Audi extends Car {

	public void breaking() {
		System.out.println("Audi is braking.");
	}

	@Override
	public void accelerate() {
		System.out.println("Audi is accelerating.");
		
	}
}
