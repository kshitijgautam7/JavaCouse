package methods;

public class PassByValue {

	public static void main(String[] args) {
		
		int c = 35;
		int d = 15;
		
		swap(c, d);
		System.out.println(c + "  " +d);

	}

	static void swap (int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	
}
