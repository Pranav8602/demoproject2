package Logicalcodes;

public class RevrseStringInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//My name is pranav
		
		String str ="My name is pranav";
		
		String []words=str.split(" ");
		
		String reversestring="";
		
		for (String w:words)
		{
			String reversewords="";
			
			for (int i=w.length()-1;i>=0;i--)
			{
				reversewords=reversewords+w.charAt(i);
				
			}
			reversestring=reversestring+reversewords+" ";
			
		}
		
		
		
		
		
		
		
		
		
		System.out.println(reversestring);
		
		
		
		
		
		
		
		
	}

}
