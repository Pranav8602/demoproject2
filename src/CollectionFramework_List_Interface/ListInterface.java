package CollectionFramework_List_Interface;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList
		
		ArrayList list = new ArrayList();
		
		list.add(4);
		list.add(5);
		list.add(12.5);
		list.add("String");
		list.add(1);
		
		System.out.println(list);
		
		list.remove(3);//string will nor show
		System.out.println(list);
		
		list.size();
		System.out.println("size:"+list.size());
		
		list.set(2, 500);
		System.out.println(list);
		
		
		System.out.println(list.isEmpty());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//list -duplicates are allowed
		
		
		//Arraylist program 2
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
