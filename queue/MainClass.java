package queue;


public class MainClass {

		public static void main(String args[]) {
	
			MyQueue<Integer> mq = new MyQueue<>();
			
			mq.enqueue(13);
			mq.enqueue(2);
			mq.enqueue(123);
			mq.enqueue(45);
			
			System.out.println(mq.dequeue());
			System.out.println(mq.dequeue());
			System.out.println(mq.dequeue());
			System.out.println(mq.dequeue());
			System.out.println(mq.dequeue());
			
		}
}