package ExceptionHandeling;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		String s= "ABCD";
//		
//		int var =Integer.parseInt("1234");
//		System.out.println(var);
//		try
//		{
//			float var1 = Float.parseFloat("1455 4");
//			System.out.println(var1);
//		}
//		catch (Exception e)
//		{
//			System.out.println("we are into catch block");
//		}
//		finally
//		{
//			System.out.println("finally block will always get excuted");
//		}
//		byte variable =Byte.parseByte("5");
//		System.out.println(variable);
		
		
		//Number format Exception
		String s="ABCD";
		
		int var = Integer.parseInt("1234");
		System.out.println(var);
		
		try
		{
			float var1 =Float.parseFloat("1455 4");
			System.out.println(var1);
		}
		catch (Exception e)
		{
			System.out.println("we are into catch bloc");
		}
		finally
		{
			System.out.println("we are into finally block");
			
		}
		
		byte variable=Byte.parseByte("5");
		System.out.println(variable);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
