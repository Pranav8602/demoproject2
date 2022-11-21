package OopsConcept;

public interface Interface {

	int b=10;
	
	void m1();
	void m2();
	void m3();
	void m4();
	
	default void click()
	{
		System.out.println("this is default method");
	}
	
}
