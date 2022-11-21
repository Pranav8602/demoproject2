package CollectionFramework_Queue_Interface;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PriorityQueue q = new PriorityQueue();
		
		q.add("a");
		q.offer("b");
		q.offer("c");
		q.offer("d");
		
		System.out.println(q);
		
		//it works on first in first out
		System.out.println(q.peek());//a in
		System.out.println(q.poll());//a out
		
		System.out.println(q.peek());//b in
		System.out.println(q.poll());//b out
		
		System.out.println(q.element());
		System.out.println(q.peek());
		System.out.println(q);
		
		q.remove();
		q.poll();//null
		System.out.println(q);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
