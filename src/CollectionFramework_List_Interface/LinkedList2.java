package CollectionFramework_List_Interface;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList list = new LinkedList();
		

		
		list.add(4);
		list.add(5);
		list.add(12.5);
		list.add("String");
		list.add(1);
		list.add(7);
		list.add(2);
		list.add('e');
		
		System.out.println(list);
		
		
		list.addFirst(1);
		System.out.println(list);
		
		list.addLast(7);
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		System.out.println(list.get(2));
		System.out.println(list.getFirst());
		
		//insertion and deletation -use-LinkedList
		//retrival-use-ArrayLIST
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
