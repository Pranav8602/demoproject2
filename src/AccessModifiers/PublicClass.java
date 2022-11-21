package AccessModifiers;

public class PublicClass {

	
	public int a=500;
	
	public void test()
	{
		System.out.println("This is public class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PublicClass P = new PublicClass();
		System.out.println(P.a);
		P.test();
		
		
	}

}
