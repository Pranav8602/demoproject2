package CollectionFramework_Queue_Interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Deque dq = new ArrayDeque();
		
		dq.add("for");
		dq.addFirst("java");
		dq.addLast("java");
		
		System.out.println(dq);
		
	}

}
