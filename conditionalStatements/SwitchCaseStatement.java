package conditionalStatements;

import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {
//		int dayOfWeek = 2;
//		switch (dayOfWeek) {
//		
//		case 1:
//		case 2:
//			System.out.println("I am on leave.");
//			break;
//		
//			
//		
//		case 3:
//			System.out.println("I am playing football");
//			break;
//		default:
//			System.out.println("I don't know what date it is");
//		}

		
		Scanner sc = new Scanner (System.in);
		int rating = sc.nextInt();
		
		switch (rating) {
		
		case 1: 
		case 2:
			System.out.println("Bad");
			break;
		case 3:
			System.out.println("Average");
			break;
		case 4: 
		case 5:
			System.out.println("Good");
			break;
		}
	}

}
