package nestedLoops;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
//	ANSWER 1
//		Scanner sc= new Scanner (System.in);
//		int n = sc.nextInt();
//		for (int i =1; i<=n; i++) {
//			for (int j = 1; j <= i-1; j++) {
//			System.out.print("  ");
//			
//	}
//
//		for (int j=1; j <=n-i+1; j++) { 
//			System.out.print("* ");
//		}
//		System.out.println();
//		
//		}
//		}
//}

// ANSWER 2
	
//			Scanner sc = new Scanner (System.in);
//			int n= sc.nextInt();
//			
//			
//			for (int i=1; i <=n; i++) {
//				for (int j=1; j <= 2*i; j++) {
//				
//					System.out.print("  ");
//					}
//			
//			for (int j =1; j <= n-i+1; j++ ) {
//			System.out.print("* ");
//			}
//			
//		System.out.println();	
//			}
//	}			
//}			
		
		
//		ANSWER 3
		
		
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		
			
		for (int i=1; i <=n; i++) {
			for (int j=1; j <= n-i+1; j++) {
				
				System.out.print("  ");



			}

			for (int j=1; j <= i; j++) {
				System.out.print("*" +"  ");
			}
				
				System.out.println();
				
//		}	
//				
//	}		

		
		//	ANSWER 4
		
//		Scanner sc = new Scanner (System.in);
//		int n= sc.nextInt();
//		
//		int rows = 2*n-1;
//		for (int i=1; i <=rows; i++)  {
//			
//			if (i<=n) {
//				
//				for (int j=1; j <= n-i; j++) {
//					
//					System.out.print("  ");
//					
//					
//				}
//				
//				for (int j=1; j <= i; j++) {
//					System.out.print("* ");
//				}
//				} else {
//					for (int j=1; j <= i-n; j++) {
//				
//						System.out.print("  ");
//					}						
//
//				
//					for (int j=1; j<= rows-i+1; j++) {
//					System.out.print("* ");
//				}
//				}		
//	System.out.println();	
//
//
//		
//		}
//		
//		
//	}	
//}
	

//	Scanner sc= new Scanner (System.in);
//	int n= sc.nextInt();
//		
//	int rows = 2*n+2;
//		for (int i=1; i <= rows; i++) {
//			
//			if (i<=3) {
//				
//				for (int j=1; j <= n-i+1; j++ ) {
//				System.out.print("* ");
//				}
//				
//				for (int j=1; j <= 2*i; j++) {
//					System.out.print("  ");
//					
//				}
//				for (int j=1; j <= n-i+1; j++) {
//					System.out.print(" *");
//				}
//				} for(int m=n; m>=1; m--) {
//					for(int j=1; j <= i-2*n+1; j++) {
//						System.out.print("* ");
//						
//					}
//					for (int j=1; j <=2*i-1; j++) {
//						System.out.print("  ");
//					}
//					for(int j=1; j <= i-2*n+1; j++) {
//					System.out.print(" *");
//					}
//				
//				}	
//		
//				
//			
//				
//			
//			
//					System.out.println();	
//	
 	}
							
		}
}


//  ANSWER 5