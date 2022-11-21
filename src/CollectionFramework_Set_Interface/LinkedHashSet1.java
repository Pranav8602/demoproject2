package CollectionFramework_Set_Interface;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashSet hs = new LinkedHashSet();
		
		hs.add("1");
		hs.add("1");//duplicates are not allowed is set
		hs.add("john");
		hs.add("doe");
		hs.add(null);
		hs.add(null);
		hs.add(12.5f);//insertion order is  preserved in set
		
		System.out.println(hs);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
