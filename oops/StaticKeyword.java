package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {

	static {
		
		System.out.println("In block1 ");
	}
	
	static {
		System.out.println("in block 2");
	}

public static void main(String[] args) {
	
	System.out.println("Inside main");
	  A objA = new A();
	  B objB = objA.new B();
	  
	  C objC = new A.C();
	  
	}
static {
	System.out.println("in block 3");
}


}
