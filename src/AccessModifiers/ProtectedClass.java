package AccessModifiers;

public class ProtectedClass {

	
	protected int a=500;
	
	protected void test()
	{
		System.out.println("This is protected method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProtectedClass P = new ProtectedClass();
		System.out.println(P.a);
		P.test();
	}

}
