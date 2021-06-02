package loops;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {

//WAP a program to print Fibonacci series of n terms where n is input by user: 0 1 1 2 3 5 8 13 24.....

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		
		System.out.print(a+"  ");
		System.out.print(b+"  ");
		for (int i=0; i<n-2; i++) { 
		int c =a+b;
		System.out.print(c+"  ");
			a=b;
			b=c;
		}
		
	}

}

