package ExceptionHandeling;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int array []=new int [6];
        
		try
		{
			array[6]=50;
			System.out.println(array[6]);
		}
		catch (Exception e)
		{
			System.out.println("we are into catch block");
		}
		finally
		{
			System.out.println("we are into finally block");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
