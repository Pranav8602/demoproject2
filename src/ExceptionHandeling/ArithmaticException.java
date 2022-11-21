package ExceptionHandeling;

public class ArithmaticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method started");
		
		System.out.println("main method in progress");
		//Exception Handelling with try and catch block
		
		try
		{
			int a=20;
			System.out.println(a/0);//throws arithmatic exception
		}
		catch(Exception obj)
		{
			System.out.println("we are into catch block");
		}
		System.out.println("Main method completed");
		
	}

}
