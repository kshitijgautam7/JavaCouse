package oops.abstraction;

public class RepairShop {

	public static void repairCar(Car  car) {
		System.out.println("car is repaired");

	}
	

	public static void main(String[] args) {
		
		Bmw bmw = new Bmw();
		Audi audi = new Audi();
		
		repairCar(bmw);
		repairCar(audi);
	}
	
}
