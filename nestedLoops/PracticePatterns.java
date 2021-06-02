package nestedLoops;

import java.util.Scanner;

public class PracticePatterns {

	public static void main(String[] args) {
	
		
//		ANSWER 1
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		for (int i=1; i<=n;i++) {
//			
//			for(int j=1; j<=i-1;j++) {
//				System.out.print("  ");
//			}
//			for (int j=1; j<=n-i+1; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//
//	}
//
//}

//		ANSWER 2
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		for (int i=1; i<=n;i++) {
//			
//			for(int j=1; j<=2*i-2;j++) {
//				System.out.print("  ");
//			}
//			for (int j=1; j<=n-i+1; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//
//	}
//
//}
		
		
//		ANSWER 3
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		for (int i=1; i<=n;i++) {
//			
//			for(int j=1; j<n-i+1;j++) {
//				System.out.print("  ");
//			}
//			for (int j=1; j<=i; j++) {
//				System.out.print("*  ");
//			}
//			System.out.println();
//		}
//		
//
//	}
//
//}
		
//		ANSWER 4
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		int rows = 2*n-1;
//		for (int i=1; i<=rows;i++) {
//			
//			if(i<=n) {
//			for(int j=1; j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			for (int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			}else {
//				for (int j=1; j<=i-n; j++) {
//					System.out.print("  ");
//					}
//				for (int j=1; j<=rows-i+1;j++) {
//					System.out.print("* ");
//				}
//			}
//		System.out.println();
//			}
//			
//
//	}
//
//}
		
		
//		ANSWER 5
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		int rows = 2*n+2;
//		for (int i=1; i<=rows;i++) {
//			
//			if (i<=n) {
//			for(int j=1; j<=n-i+1;j++) {
//				System.out.print("* ");
//			}
//			for (int j=1; j<=2*i; j++) {
//				System.out.print("  ");
//			}
//			for (int j=1; j<=n-i+1; j++) {
//				System.out.print(" *");
//			}
//			}else if (n>i && n<6) {
//				System.out.println();
//				
//			} else {
//				for(int j=1; j<=i-2*n+1;j++) {
//					System.out.print("* ");
//				}
//				for (int j=1; j<=rows-i; j++) {
//					System.out.print("  ");
//				}
//				for (int j=1; j<rows-i+n; j++) {
//					System.out.print("  ");
//				}
//				for (int j=1; j<=i-2*n+1; j++) {
//					
//					System.out.print(" *");
//				}
//			
//		}
//			System.out.println();
//		}
//
//	}
//
//}
		
//		ANSWER 6 (error)
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		int number = 1;
//		for (int i=1; i<=n ;i++) {
//			
//			
//			for(int j=1; j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			for (int j=1; j<=i; j=j+2) {
//				for (int m=1; m<=i; m++) {
//				System.out.print(number++ +" ");
//			
//			}
//			}
//		System.out.println();
//			}
//			
//
//	}
//
//}
		
//		ANSWER 7
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		int number = 1;
//		for (int i=1; i<=n ;i++) {
//			
//			
//			for(int j=1; j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			for (int j=1; j<=1; j++) {
//				
//				System.out.print(number +" ");
			
			

//			}
//			for(int j=2; j<=i;j++) {
//				System.out.print("0 ");
//			}
//			
//			for(int j=3; j<=i;j++) {
//				System.out.print("0 ");
//			}
//			if(i>=2) {
//			for (int j=1; j<=1; j++) {
//				
//				System.out.print(number +" ");
//			}
//			}
//			number++;
//			
//		System.out.println();
//		}
//			
//
	}

}