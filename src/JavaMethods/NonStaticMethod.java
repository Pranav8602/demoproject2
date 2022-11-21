package JavaMethods;

public class NonStaticMethod {

	//String s = "john doe";
	public void test()
	{
		System.out.println("This is non static method");
	}
	
	{
		System.out.println("this is non static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticMethod var =new NonStaticMethod();
		
	//	System.out.println("string value is:"+(var.s));
	    var.test();	}

}
