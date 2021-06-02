package priorityQueue;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
	
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			
			pq.add(69);
			pq.add(55);
			pq.add(13);
			pq.add(1);
			
			System.out.println(pq);
			System.out.println(pq.remove());
			System.out.println(pq.remove());
			System.out.println(pq.remove());
			
	}

}
