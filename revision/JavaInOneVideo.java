package revision;

import java.util.Scanner;

import arrays.AverageMarks;

public class JavaInOneVideo {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner (System.in);
//		System.out.print("Enter your name: ");
//		String name = sc.nextLine();
//		 
//		System.out.println(name);   

		
//		Scanner sc =new Scanner(System.in);
//		char grade = sc.next().charAt(0);
//		
//		switch (grade) {
//		case 'A' :
//			System.out.println("O");
//		break;
//		
//		case 'B' :
//			System.out.println("E");
//			
//		break;
//		
//		case 'C' :
//			System.out.println("good");
//			
//		break;
//		
//		
//		default:
//			System.out.println("not graded");
//		}
//for, while, dp-while
		//		for (;;) //(infinite loop)
		
//   for (int i=0; i<10; i++) {
//	   System.out.println("I am a legend. " +i ); //(for loop)
//   }

//		int a =23;
//		while(a<=  100) {
//			System.out.println(a);
//			a++;
		
//		int a=23;
//		do {
//			System.out.println(a);
//			a++;
//		} while (a>100);
		
//		array
//		23,12,56,34,99
		
//		int marks[] = new int [5];
//		marks [0] = 23;
//		marks [1] = 12;
//		marks [2] = 56;
//		marks [3] = 34;
//		marks [4] = 99;
		
//		int marks[] = {23,12,56,34,99,12,34};		
//		for (int i=0 ; i<marks.length; i++) {
//			System.out.println(marks[i]);
//		}
		
		
		
//		int a [] [] = new int  [2] [3];
		
//	int a [] [] = {
//			{
//			1,2
//	}, {
//		3,4
//	}
//	};
//	
//		System.out.println(a[1] [0]);
		
//	System.out.println(average(3,6));	
//		int s[] = new int [3];
//		try {
//		System.out.println(2/0);
//		} catch (Exception e) {
//			System.out.println("Error aaya tha");
//			System.out.println(e.getLocalizedMessage()); //check krne ka)
//		}
//		System.out.println("niche ke line");
//	}
		
//		method
		
		//returnType functionName (arguments) {		}
//		 
//		 static int average (int firstNumber , int seconNumber  ) {
//		 int sum = firstNumber + seconNumber;
//		 return sum/2;
		 
	
//	}

//	} 
		
		
//		for(int i = 0; i <100; i=i+2) {
//			System.out.println("Hello World " +i);
//		}
		
//		int sum = 0;
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		for (int i=1; i<=n; i++) {
//			sum = sum+i;
//			}
//			System.out.println("Sum of number is: " +sum);
		
//		int n=0;
//			for (int i=100; i>n; i--) {
//		
//			System.out.println(i);
//		
//		}
		
//		int tableOf =23;
//		
//		for (int i=1; i <=10; i++) {
//		
//				
//		System.out.println(tableOf*i);
//		}
		
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		int factorial =1;
//		for(int i=n ; i>=1; i--) {
//		factorial = factorial * i;
//		}
//		System.out.println(factorial);
		
		
//		fibbonacci series
		
		
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		int a = 0;
//		int b = 1;
//		
//		System.out.print(a+ " ");
//		System.out.print(b+ " ");
//		
//		for (int i=0 ; i<n-2; i++) {
//		
//		int c = a+b;
//		
//		System.out.print(c+ " ");
//		
//		a = b;
//		b = c;
//		
//		}
		
		
//	find power of a number without using math function	
//		Scanner sc = new Scanner (System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		int result = 1;
//		
//		for (int i=0; i<b; i++) {
//			
//			result *= a; //result = result * a
//		}
//		System.out.println(result);
		
		
		
//		check a number is prime or not
		
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		boolean isPrime = true;
//		
//		for (int i=2 ; i*i<n; i++) {
//			
//			if (n % i == 0) { 
//				
//				isPrime = false;
//				break;
//				
//			}
//			}
//			
//			if (n<2) isPrime = false;
//			
//			System.out.println("IS PRIME " +isPrime);
			
//	SERIES SUM
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		float result = 0;
//		
//		for(float i=1; i<=n; i++) {
//			result += 1/i;
//			
//		}
//			System.out.println(result);
		
//		Series sum 1 - 1/2 + 1/3 - 1/4 + 1/5 ......n (if goes till infinity log base e ^ 2) //taylor series
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		float result = 0;
//		
//		for(float i=1; i<=n; i++) {
//		
//			if (i % 2 == 0) {
//				result -= 1/i;
//			
//		}	else {
//				result += 1/i;
//			}
//		}
//		System.out.println(result);
		
		
		
//		Break
		
//		for(int i=1; i<=100 ;i++) {
//		if (i==35) continue;
//	
//		
//		System.out.println(i);
//		}
		
//		WAP TO RUN  A LOOP INFINTELY UNTIL USER INPUTS A NEGATIVE NUMBER
		
//		Scanner sc = new Scanner (System.in);
//		
//		for(;;) {
//		int n = sc.nextInt();
//		
//		if(n<0)
//		break;
//	}  
		
		
//		Continue
		
//		for(int i=1; i<=100; i++) {
//			if(i>=40 && i<=50)
//				continue;
//			System.out.println(i);
//		}
		
		
//		Nested for loop
		
	
//		table 1 to n
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		for (int j=1; j<=n; j++) {
//			System.out.println();
//			 System.out.print("table of " +j + " is: ");  
//		
//			for (int i=1; i<=10; i++ ) {
//				System.out.print(i*j + " ");
//			}
//			
//		}
		
//		PATTERNS
//		pattern1
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		for (int i=1; i<=n ;i++) {
//			
//			for (int j=1; j<=n ;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	
//		
//		
//	}
//}

//		pattern2
		
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i-1; j++) {
//				
//			System.out.print("  ");
//			}
//			for(int j=1 ; j<=n-i+1; j++) {
//			
//			System.out.print("* ");
//		}
//		System.out.println();
//		}
		
		
//		pattern b
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i+1; j++) {
//				
//				System.out.print("* ");
//				
//			}
//		System.out.println();
//	}
		
//		pattern d
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				
//				System.out.print("  ");
//				
//			}
//				for(int j=1; j<=i; j++) {
//				
//				System.out.print("* ");
//				
//			}
//			
//		System.out.println();
//	}
		
//		pattern c
		
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i-1; j++) {
//				
//				System.out.print("  ");
//				
//			}
//				for(int j=1; j<=n-i+1; j++) {
//				
//				System.out.print("* ");
//				
//			}
//			
//		System.out.println();
//	}
		
		
//		Pattern 1 (adv)
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			
//			for (int j=1; j<=n-i; j++) {
//				System.out.print("  ");
//			}
//			for (int j=1; j<=i; j++) {
//				System.out.print("*  ");
//			}
//			System.out.println();
//		}
// }		
		
	
//		pattern 2 (adv)
		
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		int number = 1;
//		
//		for(int i=1; i<=n; i++) {
//			
//			for (int j=1; j<=n-i; j++) {
//				System.out.print("  ");
//			}
//			for (int j=1; j<=i; j++) {
//				System.out.print(number++ +"  ");
//			}
//			System.out.println();
//		}
 
	
//		pattern 3 (adv)
		
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		int rows = 2*n-1;
//		
//		for(int i=1; i<=rows; i++) {
//			if(i<=n) {
//			for (int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			}else{
//			for (int j=1; j<=rows-i+1; j++) {
//				System.out.print("* ");
//			}
//			
//		}
//	
//			System.out.println();
//		}

//		pattern 4 (adv)
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		System.out.println("* ");
//		for(int i=2; i<=n-1; i++) {
//			System.out.print("* ");
//			
//			
//			
//			for(int j=1; j<=i-2;j++) {
//				System.out.print("  ");
//			}
//		
//		
//		System.out.print("* ");
//		System.out.println();
//		}
//		
//		
//		
//		if(n>1) {
//		for (int j=1; j<=n; j++) {
//			System.out.print("* ");
//		}
//			System.out.println();
//		}
		
		
//		PRACTICE PATTERNS ASSIGN
//		pattern q1
		
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			
//			
//			for (int j=1; j<=i-1;j++) {
//				System.out.print("  ");
//			}
//			for (int j=1; j<=n-i+1;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
//		pattern q2
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			
//			
//			for (int j=1; j<=2*i-2;j++) {
//				System.out.print("  ");
//			}
//			for (int j=1; j<=n-i+1;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		pattern q3
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			
//			
//			for (int j=1; j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			for (int j=1; j<=i;j++) {
//				System.out.print("* ");
//				System.out.print("  ");
//			}
//			System.out.println();
//		}
	
//	 pattern q4
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		int rows = 2*n-1;
//		for(int i=1; i<=rows; i++) {
//			
//			if (i<=n) {
//			for (int j=1; j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			for (int j=1; j<=i;j++) {
//				System.out.print("* ");
//			}
//			}else {
//			
//					for (int j=1; j<=i-n;j++) {
//						System.out.print("  ");
//			}
//					for (int j=1; j<=rows-i+1;j++) {
//					
//						System.out.print("* ");
//			}
//			
//		}
//			System.out.println();
//	}
		
//		pattern que 5
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//			
//		int rows = 2*n+2;
//		
//		for(int i=1; i<=rows; i++) {
//			if(i<=n) {
//		
//				for(int k=1; k<=n-i+1;k++) {
//					System.out.print("* ");
//				}
//			
//				for(int k=1; k<=2*i;k++) {
//					System.out.print("  ");
//				}
//				for(int k=1; k<=n-i+1;k++) {
//					System.out.print("* ");
//				}
//			}else if(i>n && i<6) {
//
//			System.out.print("  ");
//			
//			}else {
//				for(int k=1; k<=i-2*n+1;k++) {
//					System.out.print("* ");
//				}
//				for (int j=1; j<=rows-i; j++) {
//					System.out.print("  ");
//				}
//				for(int k=1; k<=rows-i+n-1;k++) {
//					System.out.print("  ");
//				}
//				for(int k=1; k<=i-2*n+1;k++) {
//					System.out.print("* ");
//				}
//				
//				
//			}
//			
//			System.out.println();
//		}
		
//		pattern 6 	
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		int number = 1;
//		
//		
//		for(int i=1; i<=n; i++)	 {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");
//			}
//			System.out.println(number);
//			for(int j=1; j<=i;j=j+2) {
//				
//				for(int m=1; m<=i; m++) {
//			
//			System.out.print(number++ +"  ");
//				}
//			}
//		
//		System.out.println();
//		
//}
	
//	pattern 9
		
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		System.out.println("* ");
//		for(int i=2; i<=n-1; i++) {
//			System.out.print("* ");
//			for(int j=1; j<=i-2; j++) {
//				System.out.print("  ");
//			}
//
//					System.out.print("* ") ;
//
//			
//			System.out.println();
//		}
//		
//		for(int i=1; i<=n;i++) {
//			System.out.print("* ");
//		}
//	}
//}
//	pattern 10 
		
			
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		for(int i=0; i<=n;i++) {
//			for(int j=0; j<=n; j++) {
//				if(i+j==4||i==4||j==4) {
//					System.out.print("* ");
//				}
//				else { 
//				
//				System.out.print("  ");	
//				}
//			}
//			System.out.println();
//		}
//		
//	}

		
//}
//		wap to find the Sum of digits of a number
		
		
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
//		
//		int temp = n;
//		int sum = 0;
//		
//		
//		while(n>0) {
//			
//			int lastDigit = temp % 10;
//			temp /= 10;
//			sum += lastDigit;
//			System.out.println(temp + "  " +lastDigit + "  " + sum);
//		}
//		System.out.println("The sum of digits of " +n + " is: "  +sum);
	
	
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int temp = n;
//		int reversedNumber = 0;
//		
//		
//		while(temp>0) {
//			int lastDigit = temp % 10;
//			
//			reversedNumber = reversedNumber * 10 + lastDigit;
//			
//			temp /= 10;
//			
//		}
//			if(reversedNumber == n) {
//				System.out.println("The number " +n + " is plaindrome.");
//			}else {
//				System.out.println("The number " +n + " is not plaindrome.");
//			
//	
//		}
		
		
		
//		do while
//	Scanner sc = new Scanner(System.in);
//	
//	int n =1;
//	
//	do {
//		n = sc.nextInt();
//		System.out.println("number is " +n);
//	} while (n != 0);
	
	
//ARRAYS
		
//		
		
//			int[] marks = new int [5]; 
		
//		double [] marks = {1.0 , 2.9 , 3.5};
//		marks[0] = 4.5;  //array can be updated
//
//		System.out.println(marks[0]);
		
		
//	int [] age = {2, 5 ,1, 33, 15};
//		
//		for (int i=0; i<age.length; i++) {
//			System.out.println(age[i]);
//		}
				
		
//		Average marks of students
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter the number of students");
//		int n = sc.nextInt();
//		
//		
//		int[] marks = new int[n];
//		
//		System.out.println("Enter marks now: " );
//		for	(int i =0; i<n; i++) {
//			marks[i] = sc.nextInt();
//		}
//			int averageMarks = 0;
//			for	(int i =0; i<n; i++) {
//			averageMarks += marks[i];
//			
//		}
//			
//			averageMarks /= n;
//			System.out.println("The avreage marks is : " +averageMarks);
		
	
//	Multi Dimensional arrays
//	2-D Arrays
	
	
	
//	int a[] [] = new int [5][3];	
	
//		int b[][]	= {
//				{3,1,5,7,2},
//				{4,1,7},
//				{1,2,3,5,6,8}
//		};
//		System.out.println(b[0][2]);
				
//			Matrix Addition 
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Dimensions: ");
//		int rows = sc.nextInt();
//		int cols = sc.nextInt();
//		
//		int a[][] = new int [rows][cols];
//		int b[][] = new int [rows][cols];
//		
//		System.out.println("Enter array a: ");
//		for(int i=0; i<rows; i++) {
//			for(int j=0; j<cols; j++) {
//				
//			  a[i][j] = sc.nextInt();
//			}
//		}
//		
//		System.out.println("Enter array b: ");
//		for(int i=0; i<rows; i++) {
//			for(int j=0; j<cols; j++) {
//				
//			 b[i][j] = sc.nextInt();
//			}
//		}
//		int c [][] = new int [rows][cols];
//		for(int i=0; i<rows; i++) {
//			for(int j=0; j<cols; j++) {
//				
//			 c[i][j] = a[i][j] + b[i][j];
//		
//			}
//		}
//		System.out.println("matrix c is: ");
//		for(int i=0; i<rows; i++) {
//			for(int j=0; j<cols; j++) {
//				
//			 System.out.print(c[i][j]+ "  ");
//			
//			}
//			System.out.println();
//		}
			
//		int[] age = { 2, 5 ,6, 7 , 10};
//		for(int i=0; i<age.length; i++) {
//			System.out.println(age[i]);
//		}
		
		
//		AVERAGE MARKS
		
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter the number of Students: ");
//		int n = sc.nextInt();
//		
//		int marks[] = new int [n];
//		
//		System.out.println("Enter the marks now: ");
//		for(int i=0; i<n;i++)  {
//		marks[i] = sc.nextInt();
//			
//		}
//		
//		int averageMarks = 0;
//		for(int i=0; i<marks.length; i++) {
//			averageMarks += marks[i];
//			
//		}
//			averageMarks /= n;
//			
//			System.out.println("the average marks is: " +averageMarks);
		
//		int a[][] = new int [5][3];
//		System.out.println(a[2][2]);
		
//		int b[][] = {
//				{1, 3, 4, 5, 6},
//				{1 , 5, 6},
//				{3,5,2,5,2}
//				};
//		
//		System.out.println(b[2][3]);
		
	
//	MATRIX MULTIPLICATION (TO -DO)

		
		
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter the no of rows: ");
//		int rows =  sc.nextInt();
//		System.out.println("Enter the no of cols: ");
//		int cols = sc.nextInt(); 
//		
//		int a[][] = new int [rows][cols];
//		int b[][] = new int [rows][cols];
//		
//		System.out.println("Enter martix a: ");
//		for(int i=0; i<rows;i++) {
//			
//		   for(int j=0; j<cols;j++) {
//			
//			   a[i][j] = sc.nextInt();
//			   }
//		}
//		System.out.print("Enter martix b: ");
//		for(int i=0; i<rows;i++) {
//			
//		   for(int j=0; j<cols;j++) {
//			
//			   b[i][j] = sc.nextInt();
//			   }
//		}
//		
//		int c[][] = new int [rows][cols];
//		for(int i=0; i<rows;i++) {
//			
//			   for(int j=0; j<cols;j++) {
//				
//				   c[i][j] = a[i][j] + b[i][j];
//				   }
//		}
//		System.out.println("The result arrays is: ");
//		for(int i=0; i<rows;i++) {
//			
//			   for(int j=0; j<cols;j++) {
//				
//				 System.out.print(c[i][j]+ " ");
//				   }
//			   System.out.println();
//		}
	
	
	
//	Bubble sort
	
//	int a[] = {2, -3 ,5 , 7 , 6};
//	
//	int n = a.length;
//	
//	for(int i=0; i<n-1;i++) {
//	
//		boolean sorted = true;
//	for(int j=0; j<n-1-i;j++) {
//		
//		if(a[j+1] < a[j]) {
//		
//		int temp = a[j+1];
//		a[j+1] = a[j];
//		a[j] = temp;
//	
//		sorted = false;
//		}
//	}
//	
//		if(sorted) break;
//		
//	} 
//		for(int item :a) {
//			System.out.print(item +"  ");
//		
//	}
	
	
// Selection sort
		 
		
//	int a[] = {2, -1 , 3 , 7 , -6} 	;
//	
//	int n = a.length;
//	
//	for(int i=0; i<n-1;i++) {
//		int minInd = i;
//		
//		for(int j=i; j<n; j++) {
//			
//			if(a[j] < a[minInd]) {
//				minInd = j;
//				
//			}
//			
//		}
//		
//			int temp = a[i];
//			a[i] = a[minInd];
//			a[minInd] = temp;
//	}
//		
//		for(int e: a) {
//			System.out.print(e+ " ");
//		}
		
//		String Intro
		/*String 2 comp = i)String pool Area ii)Heap Area
		 * Strings are immutable (Cannot change)
		 */
//		String name1 = "Kshitij"; //USING LITERALS (Uses string pool area)
//		String name2 = "Kshitij";
//		String anotherName = new String ("Kshitij"); //Creates a string in Heap Area
//		
//		
//		System.out.println(name1 == name2);
//		System.out.println(name1 == anotherName);
		
/*		IMP INTERVIEW QUE
 * QUE -> WHEN WE INSTALISE A STRING USING NEW HOW MAY String's are made
 * ANS -> 2 (1 in heap, 1 in String pool). 
 */ 
 

//		String name = "Kshitij Gautam";
//		String name2 = new String ("Kshitij Gautam");
//		System.out.println(name.charAt(5));
//		System.out.println(name.length());
//		System.out.println(name.substring(7));
//		System.out.println(name.substring(0, 13));
//		System.out.println(name.contains("Kshitij"));
//		System.out.println(name.equals(name2));
//		System.out.println(name.isEmpty());
//		
//		String name = "Kshitij";
//		name = name+" Gautam";
//		System.out.println(name.concat(" is king"));
//		System.out.println(name.replace('s','a'));
		
//		String cars = "RangeRover,BMW,Hyundai,Mercedes,Audi";
//		String allCars[]= cars.split(",");
		
//		for(String car : allCars) {
//			System.out.println(car);
//		}
	
//		System.out.println(cars.indexOf(7));
//		System.out.println(cars.toLowerCase());
//		System.out.println(cars.toUpperCase());
		
//		String name = "    Kshitij    ";
//		System.out.println(name.trim());
//		System.out.println(name);
		
		
//		ANAGRAMS OF A STRING (SAME NO. OF CHAR, SAME NO OF TIME REPEAT) V.V.I
//		EX- (CAT ,ACT) ; (aab, aba)
		
//		Check whether two Strings are anagram of each other
		

//		String a = "aab";
//		String b = "abc";
//		
//		boolean isAnagaram = false;
//		boolean visited[] = new boolean[b.length()];
//	if (a.length() == b.length()) {
//		for(int i=0; i<a.length(); i++) {
//		char c = a.charAt(i);
//		isAnagaram = false;
//		for(int j=0; j<b.length(); j++) {
//		if (b.charAt(j) == c && !visited[j]) {
//			visited[j] = true;
//			isAnagaram = true;
//			break;
//		
//		}
//		}
//			if(!isAnagaram) { 
//				break;
//			}
//		}
//		}
		
//		String a = "aa#%1230";
//		String b = "a0321%#a^";
//		
//		boolean isAnagaram = true;
//		int al[] = new int [256];
//	
//		
//		for (char c : a.toCharArray()) {
//			int index = (int) c;
//			al[index]++;
//		}
//		
//		for (char c : b.toCharArray()) {
//			int index = (int) c;
//			al[index]--;
//		}
//		
//		for(int i=0; i<256; i++) {
//			if(al[i] != 0) {
//				isAnagaram = false;
//				break;
//			} 
//		}
//		if(isAnagaram) {
//			System.out.println("Anagram");
//		}else {
//			System.out.println("not Anagram");
//		}
		
//		oops
		

	class Cat {
		
		boolean hasFur;
		String color, bread;
		int legs, eyes;
		
		
		public void walk() {
			System.out.println("Cat is walking");
		}
		
		public void eat() {
			System.out.println("Cat is EATING");
		}
		
		public void description() {
			System.out.println("My cat has " +legs+ " legs and " + eyes + " eyes.");
		}
	
	}
		
		
		class Dog {
			
		}
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.legs = 3;
		cat1.eyes = 2;
		
		cat2.legs = 4;
		cat2.eyes = 2;
		
		cat1.description();
		cat2.description();
				
		
 }
	
}
	
// Main class program mein ek ho hota hai jo same as file name rhta hai	
// How to create object of a class?

/* ClassName objectName = new ClassName();

	eg:- 
		Phone onePlus7 = new Phone();
		Phone iPhone11 = new Phone();
*/






