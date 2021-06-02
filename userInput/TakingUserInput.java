package userInput;

import java.util.Scanner;

public class TakingUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		double y = sc.nextDouble();		
		sc.nextLine();
		String hello = sc.nextLine();
		System.out.println(hello);
//		System.out.println("Enter Pricipal: ");
//		int principal = sc.nextInt();
//		System.out.println("Enter rate: ");
//		float rate = sc.nextFloat();
//		System.out.println("Enter Time");
//		int time= sc.nextInt();
//		
//		float simpleInterest = principal*rate*time;
//		System.out.println(simpleInterest);
		System.out.println(x);
		System.out.println(y);
	
	}

}
