package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		/* WAP to calculate the following series where n is input by the user. 
		   1 + 1/2 + 1/3 + 1/4 + 1/5 + ...... 1/n */
		 
		Scanner sc = new Scanner (System.in);
		float n = sc.nextFloat();
//		
//		float result = 0;
//		
//		for (float i=1; i<=n; i++) {
//			result += 1/i;
//					
//		}
//			System.out.println(result);
		
		/* WAP to calculate the natural logarithm of 2, by adding up to n terms in series. 
		   1 - 1/2 + 1/3 - 1/4 + 1/5 - ...... 1/n. 
		   Where n is positive and input by user. */
		
		
		float result = 0;
		
		for (float i=1; i<=n; i++) {
			
			if (n % 2 == 0) {
				result -= 1/i;
			}else {
				result += 1/i;
			}
		}
			System.out.println(result);
		
		
	}

}
