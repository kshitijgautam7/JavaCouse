package loops;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		
//		for (int i=0; i<100; i++) {
//			System.out.println("Hello World " +i);
//		}

//			to print even numbers
//		for (int i=0; i<=100; i=i+2) {
//			System.out.println(i);
//		}
	
//	  	to find sum of n numbers
		
//		int sum = 0;
//		int n =50;
//		
//		
//		for (int i=1; i<=n; i++) {
//			sum = sum+i;
//			
//		}
//			System.out.println(sum);
			
			
//     DECREMENT NUMBERS	
//		for (int i=100; i>0; i--) {
//			System.out.println(i);
//		}
		
		
//		WAP TO PRINT TABLE OF 15
//		Scanner sc = new Scanner (System.in);
//		int tableOf = sc.nextInt();
//				
//		
//		for (int i=1; i<=10; i++) {
//			System.out.println(tableOf * i);
//		}
		
		
//		WAP TO FIND OUT FACTORIAL(!) OF N NOS.
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int result =1;
		for (int i=n; i>=1; i--) {
			
			result = result*i;
		}		
			System.out.println(result);
		
}
		
}