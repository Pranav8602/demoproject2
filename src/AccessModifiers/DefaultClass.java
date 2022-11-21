package AccessModifiers;

public class DefaultClass {

	
	int a=500;
	
	void test()
	{
		System.out.println("This is default class");
	}
	
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultClass D =new DefaultClass();
		System.out.println(D.a);
		D.test();
		
		
		
	}

}
