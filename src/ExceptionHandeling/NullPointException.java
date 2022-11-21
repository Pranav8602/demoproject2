package ExceptionHandeling;

public class NullPointException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method started");
		System.out.println("main method in progress");
		
		try
		{
			String str = null;
			System.out.println(str.length());
		}
		catch (Exception e)
		{
			System.out.println("we are into catch block");
		}
		finally {
			System.out.println("finally block will always get excecuted");
		}
		System.out.println("Main method completed");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
