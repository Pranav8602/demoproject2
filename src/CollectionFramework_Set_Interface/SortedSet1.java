package CollectionFramework_Set_Interface;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		SortedSet ss =new TreeSet();
		
		ss.add("BMW");
		ss.add("Baleno");
		ss.add("Alto");
		ss.add("Jaguaar");
		ss.add("Audi");
		
		System.out.println(ss);
		
		System.out.println("the first element is:"+ss.first());
		System.out.println("the last element is:"+ss.last());
		System.out.println("respectiv elements :"+ss.headSet("BMW"));
		System.out.println("respective element:"+ss.tailSet("Audi"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
