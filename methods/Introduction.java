package methods;

import java.util.Scanner;

public class Introduction {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int firstNumber = sc.nextInt();
		System.out.println("Enter Second Number");
		int secondNumber = sc.nextInt();
		
		int result = maxOf(firstNumber,secondNumber);
		System.out.println(result);
		
		sayHi();
		sayHi();
		sayHi();
		
	}

	static int maxOf(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
		
//		return a > b ? a : b;
	}
	
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good Morning");
	}
}
