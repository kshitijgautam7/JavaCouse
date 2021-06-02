package conditionalStatements;

public class ShorthandIfElse {

	public static void main(String[] args) {
//		Shorthand operator If...Else (Ternary Operator)
//		variable = condition ? expressionTrue : expressionFalse

	int a =15;
	int b =17;
	
	int maxOfBothNumbers  = 0;
	
//	if (a>b) {
//		maxOfBothNumbers =a;
//	}else {
//		maxOfBothNumbers =b;
//		
//		
//	}
	
	maxOfBothNumbers = (a>b) ? a:b;
	
	System.out.println("max of both numbers is " +maxOfBothNumbers);
	
	
	}
}