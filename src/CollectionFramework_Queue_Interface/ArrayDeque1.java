package CollectionFramework_Queue_Interface;

import java.util.ArrayDeque;

public class ArrayDeque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayDeque dq = new ArrayDeque();
		
		dq.add("java(3)");
		dq.addFirst("to(2)");
		dq.addLast("Hellow(4)");
		
		dq.offer("to(5)");
		dq.offerFirst("welcome(1)");
		dq.offerLast("java(6)");

		
		System.out.println("Arraydq:"+dq);
		
		System.out.println(dq.getFirst());
		System.out.println(dq.getLast());
		
	//	dq.poll();//remove element from first 
	//dq.pollFirst();
		dq.pollLast();//remeoves last element
		System.out.println(dq);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
