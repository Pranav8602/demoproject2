package OopsConcept;

public class Inheritance2 extends Inheritance {

	
	int b=20;
	public void display()
	{
		System.out.println("This is inhertance class 2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inheritance2 I2=new Inheritance2();
		System.out.println(I2.a);
		System.out.println(I2.b);
		I2.test();
		I2.display();
		
	}

}
