package OopsConcept;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child2 multi = new child2();
		System.out.println(multi.caccbalance);
        System.out.println(multi.gaccbalance);
        System.out.println(multi.paccbalance);
        multi.caccbalance();
        multi.grandparent_parent();
        multi.parent1_property();		
	}

}


//dummy class
class grandparent
{
	int gaccbalance=10203040;
	
	void grandparent_parent()
	{
		System.out.println("gold+money");
	}
	
}

class parent1 extends grandparent
{
	int paccbalance=1020304050;
	
	void parent1_property()
	{
		System.out.println("gold+farm+money");
	}
		
}

class child2 extends parent1
{
	int caccbalance=1020304050;
	
	void caccbalance()
	{
		System.out.println("gold+farm");
	}
	
}




















