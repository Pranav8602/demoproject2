package CollectionFramework_List_Interface;

import java.util.Stack;

public class StackList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Stack <String>stk = new Stack <String>();
		
		stk.push("Apple");
		stk.push("Grapes");
		stk.push("mango");
		stk.push("Orange");
		
		System.out.println("stack "+stk);
		
		String fruits = stk.peek();
		
		System.out.println("elements at top "+fruits);
		int x =stk.size();
		System.out.println("stack size"+x);
		
		stk.search(fruits);
		System.out.println(stk);
		
		
		
		
		
		
	}

}
