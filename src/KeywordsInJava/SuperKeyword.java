package KeywordsInJava;

public class SuperKeyword {

	class parent
	{
		int a=10;
		void test()
		{
			System.out.println("this is test method in parent class");
		}
		
		parent(int a)
		{
			System.out.println("this is parent class constructor");
		}

	}
	
	class child extends parent
	{
		int a=20;
		void test()
		{
			System.out.println(a);
			System.out.println(super.a);
			System.out.println("This Method is Child class");
		}
		
		void m1()
		{
			test();
			super.test();
		}
		
		child()
		{
			super(10);
		}
		
	}
	
	//class superkeyword {
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
child obj = new child();
obj.test();
obj.m1();

	
	}
	
		
		
		
	}

}
