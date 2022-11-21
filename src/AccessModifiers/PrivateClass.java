package AccessModifiers;

public class PrivateClass {

	//private-access withing the class only
	private int a=10;
	
	void test()
	{
		System.out.println("Thos is Private method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrivateClass P = new  PrivateClass();
		System.out.println(P.a);
		P.test();
		
		
	}

}
