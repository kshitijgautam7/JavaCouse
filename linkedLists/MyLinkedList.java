package linkedLists;

public class MyLinkedList<E> {

	public Node<E> head;
	
	public void add(E data) {
		
		Node<E> toAdd = new Node<E>(data);
		
		if(isEmpty()) { //testcase to handle null poE case as the programme will crash if we try to add something to null
			head = toAdd;  //check whether the head is empty then head is to add
			return;
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = toAdd;
	}
	
		public void print() {
			Node<E> temp = head;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			
			
		}
	
	  public boolean isEmpty() {
			return head == null;
			}
	  
	  
	  public E removeLast() throws Exception {
		  Node<E> temp = head;
		  
		  if(temp == null) {
			  throw new Exception("Cannot remove last element form empty linked list");
		  }
		  
		  if(temp.next == null) {
			  Node<E> toRemove = head;
			  head = null;
			  return toRemove.data;
			  
			  
		  }
		  
			while(temp.next.next != null) {    //2nd last element vo hai jiska next ka next null hai.
	
				temp = temp.next;
			}  
			
			Node<E> toRemove = temp.next;
			temp.next = null;
			return toRemove.data;
	  }
		
	  		public E getLast() throws Exception {
	  		  Node<E> temp = head;
			  
			  if(temp == null) {
				  throw new Exception("Cannot peek last element form empty linked list");
			  }
			  
			  
				while(temp.next != null) {    //2nd last element vo hai jiska next ka next null hai.
		
					temp = temp.next;
				}  
			
				return temp.data;	
	  		}
	  		
	  		
	public static class Node<E> {
		
		public E data;
		public Node<E> next;
		
		public Node(E data) {
			this.data = data;
			next = null;
			
		}
		
	}
	  }
