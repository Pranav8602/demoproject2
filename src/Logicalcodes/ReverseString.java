package Logicalcodes;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//My Name Is Pranav
		
		String str = "My name is Pranav";
		
	    String [] words=str.split(" ");
	    
	    String reversestring="";
	    
	    for (String w:words)
	    {
	    	String reverseword="";
	    	
	    	for(int i=w.length()-1;i>=0;i--)
	    	{
	    		reverseword=reverseword+w.charAt(i);
	    		
	    		
	    	}
	    	
	    	reversestring=reversestring+reverseword+" ";
	    	
	    	
	    }
	    
	    
		System.out.println(reversestring);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
