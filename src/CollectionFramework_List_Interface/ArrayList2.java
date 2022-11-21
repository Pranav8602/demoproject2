package CollectionFramework_List_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList list = new ArrayList();
		
		list.add("x");
		list.add("y");
		list.add("z");
		list.add("a");
	    list.add("b");
	    list.add("c");
	    
	   
	  	ArrayList aldup = new ArrayList();//aldup imp method
		
	   aldup.addAll(list);//remeber addAll method
	   System.out.println(aldup);
	   
//	   aldup.remove(list);
//	   System.out.println(aldup);
		
	Collections.sort(aldup);
	System.out.println(aldup);
	
	Collections.sort(aldup, Collections.reverseOrder());
	System.out.println(aldup);
		
		Collections.shuffle(aldup);
		System.out.println(aldup);
		
		
		
		
		
		
		
	}

}
