package loops;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		boolean isPrime = true;
		for (int i=2; i<n; i++) {
			
			if(n%i==0) {
				isPrime = false;
			
			}
//			for(n<2) {
//				isPrime = false;
				
//			}
		System.out.println("the number is Prime : " +isPrime);
		}
	}
}

		
		
		