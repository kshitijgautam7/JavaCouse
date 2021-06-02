package conditionalStatements;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
//			int n = 5;
//			 if (n%2==0) {
//				 System.out.println("he loves me not");
//			 }else { 
//				 System.out.println("He loves me");
//			 }
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<=10) {
			
			System.out.println("NUMBER IS less than EQUAL TO 10");
			
		} else if (n>10 && n<20) {
			 System.out.println("NUMBER IS BETWEEN 10 AND 20");
		} else if (n>20 && n<30){
			System.out.println("NUMBER IS BETWEEN 20 AND 30");
		} else
			System.out.println("Number grater than 30");
	}

}
