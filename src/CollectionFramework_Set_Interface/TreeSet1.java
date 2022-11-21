package CollectionFramework_Set_Interface;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SortedSet <String> ts = new TreeSet<>();
		
		ts.add("A");
		ts.add("B");//preserved ascending order
		ts.add("c");//duplicates are not allowed
		ts.add("c");
		
		System.out.println(ts);
		
		
		System.out.println("order"+ts.size());
		System.out.println("treeset:"+ts.hashCode());
		System.out.println("contains:"+ts.contains("z"));
		System.out.println("last value:"+ ts.last());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
