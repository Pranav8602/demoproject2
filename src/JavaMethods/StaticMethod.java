package JavaMethods;

public class StaticMethod {

	
	public static void addition()
	{
		int a=10;
		int b=20;
		System.out.println("addition of a +b :"+(a+b));
	}
	
	public static void sub()
	{
		int a=10;
		int b=20;
		System.out.println("subtraction of b-a :"+(b-a));
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		StaticMethod b = new StaticMethod();
		b.addition();
		b.sub();
		StaticMethod.addition();
		StaticMethod.sub();
		
		
	}

}
