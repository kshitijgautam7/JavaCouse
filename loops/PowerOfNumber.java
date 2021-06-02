package loops;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
//		WAP by taking user input to find the value of one no. raised to the power of another using loop.

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		System.out.println("Enter the power");
		int n = sc.nextInt();
		
		int result =1;
		for (int i=0; i<n; i++) {
			
			result *= a;
		}	
			System.out.println(result);
			
		
		
	}

}
