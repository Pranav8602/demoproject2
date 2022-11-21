package KeywordsInJava;

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int a=10;
		
		a=50;
		
		//see if we declare variable as final then we can not change the value of variable
		
		
		class parent
		{
			void parentproperty()
			{
				System.out.println("Cash+gold+land");
			}
		    final void marriage()
		    {
		    	System.out.println("Arranged marriage");
		    }
			void bullet()
			{
				System.out.println("manual start");
			}
			
	    class child extends parent
	    {
	    	void childproperty()
	    	{
	    		System.out.println("child earned property");
	    	}
	    	@Override
	    	void marriage()
	    	{
	    		System.out.println("Love");
	    	}
	    	//Final Method-If we use final keyword with method then we  can’t  override that method  in the child class. 
	    	
	    }
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
