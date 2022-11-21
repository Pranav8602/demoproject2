package JavaMethods;

public class StaticMEthodBlock {
	
	
	
	static String str ="john";
	
	public static void test()
	{
		System.out.println("this is static method");
	}
	
	static
	{
		System.out.println("this is static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("string value is:"+str);
		test();
		
		
		
		
	}

}
