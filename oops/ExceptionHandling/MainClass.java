package oops.ExceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		
		// finally is used in ExceptionHandling as deafult is used in Switch case
		
	
		fun1();
}
	static void fun1() {
		int a = 5;
		int b = 3;
		
		int c = a/b;
		
		System.out.println(c);
//		boolean isDanger = true;
//		if(isDanger) {
//			throw new ArrayIndexOutOfBoundsException("danger was coming"); //example  amazon wrong product delivery
//		}
		
		
	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("after delay");
	}
		static void fun2() throws ArrayIndexOutOfBoundsException {
			boolean isDanger = true;
			if(isDanger) {
				throw new ArrayIndexOutOfBoundsException("danger was coming");
				
			
		}
		
	}
}