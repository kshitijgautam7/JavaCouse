package nestedLoops;

import java.util.Scanner;

public class Assigment1 {

	public static void main(String[] args) {
		// ANSWER B
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
//		 for (int i=1; i<=n; i++) {
//			 
////			for (int j=1; j<=n-i+1; j++) {
////			for (int j=n; j>=i; j--) {
//			 for (int j=0; j<=n-i; j++) {
//				System.out.print("* ");
//			}
//		 System.out.println();
//		 }
//
//	}
//
//}

//		ANSWER D
		
		for (int i=0; i<=n ;i++) {
			
			for (int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
		
		
		System.out.println();
		}
	}
}