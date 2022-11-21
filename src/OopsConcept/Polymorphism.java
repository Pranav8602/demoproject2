package OopsConcept;

public class Polymorphism {

	//Method Overloading 
	//we are overloading multiple method in this same class with same name but different paramtre
	
	
	void test()
	{
		System.out.println("zero parametre method");
	}
	void test(int a)
	{
		System.out.println("one parametre method");
	}
	void test(String a,boolean b)
	{
		System.out.println("Two parametre method");
	}
	void test(int a,int b,String c)
	{
		System.out.println("Three paramtre method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism P=new Polymorphism();
		P.test();
		P.test(10);
		P.test("john", false);
		P.test(10, 20, "DOE");
		
		
		
		
		
	}

}
