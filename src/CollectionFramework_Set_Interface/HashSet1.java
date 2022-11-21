package CollectionFramework_Set_Interface;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();
		
		hs.add("1");
		hs.add("1");//duplicates are not allowed is set
		hs.add("john");
		hs.add("doe");
		hs.add(null);
		hs.add(null);
		hs.add(12.5f);//insertion order is not preserved in set
		
		System.out.println(hs);
//		
//		hs.remove("1");
//		System.out.println(hs);
		hs.addAll(hs);
		System.out.println(hs);
		
		System.out.println(hs.contains("welcome"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
