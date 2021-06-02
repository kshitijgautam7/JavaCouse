package vectorAndStacks;

import linkedLists.MyLinkedList;

public class MyStack<E> {
				
/* Push(e)
 * Pop()	 ---> c (return)
 * Peek()	 ---> e (return)	
 */
	private MyLinkedList<E> ll = new MyLinkedList<>();
	
	void push(E e) {
		
		ll.add(e);
		
	}
	
	
	 E pop() throws Exception{
		 
		 if(ll.isEmpty()) {
			 throw new Exception("Popping from empty stack is not allowed ");
			 }
		 
		    return ll.removeLast();
		 
		 }
	
	 		E peek() throws Exception{
	 			
	 			if(ll.isEmpty()) {
	 		        throw new Exception("Popping from empty stack is not allowed ");
	 				 }	
	 			
	 			return ll.getLast();
	 			
	 			 
	 			}

}