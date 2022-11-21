package MapInterface;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		HashMap hmap = new HashMap();	
		
		hmap.put(101, "John");
		hmap.put(102, "Doe");
		hmap.put(103, "Mi");
		hmap.put(104,"RJ");
		hmap.put(104, "John");
		
		System.out.println(hmap);
		
		System.out.println(hmap.get(104));
	    hmap.replace(101,"RJ12");
	    System.out.println(hmap);
		
		hmap.remove(103);
		System.out.println(hmap);
		System.out.println(hmap.containsKey(101));
		System.out.println(hmap.containsValue("Doe"));
		
		System.out.println(hmap.isEmpty());
		
		System.out.println(hmap.size());
		System.out.println(hmap.keySet());
		System.out.println(hmap.values());
		System.out.println(hmap.values());
		
		System.out.println(hmap.entrySet());
		
		HashMap hm = new HashMap();
		
		hm.putAll(hmap);
		System.out.println(hm);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
