package KeywordsInJava;

public class ThisKeyword {

	
	int a;
	int b;
	
	void test(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+" " +b);
	}
	
	void add()
	{
		System.out.println("this is add method");
	}
	
	void sub()
	{
		add();
		this.add();
		this.add();
		System.out.println("this is sub method");
	}
	
	ThisKeyword()
	{
		System.out.println("this is zero parametre constructor");
	}
	
	ThisKeyword(int a)
	{
		System.out.println("this is one parametre constructor");
	}
	
	ThisKeyword(int a,int b)
	{
		this(20);
		System.out.println("this is two parametre constructor");
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisKeyword s= new ThisKeyword();
s.add();
s.sub();
s.test(10, 20);
new ThisKeyword(50);
new ThisKeyword(20,50);
	
	
	}

}
