package vectorAndStacks;

import java.util.Stack;
import java.util.Vector;

public class vectorAndStacks {

	public static void main(String[] args) throws Exception {
		
			MyStack<Integer> stack =  new MyStack();
			
			stack.push(13);
			stack.push(26);
			stack.push(39);
			
			int popped = stack.pop();	
			System.out.println(popped);
			
			int peeked = stack.peek();
			System.out.println(peeked);
	}

}
