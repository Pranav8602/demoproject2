package StringClassInJava;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str ="welcome to java";
		 
	String	[]words=str.split(" ");
	
	String reversestring="";
		
		for(String w:words)
		{
			String reversewords="";
			
			for(int i=w.length()-1;i>=0;i--)
			{
				reversewords=reversewords+w.charAt(i);
			}
			
			reversestring=reversestring+reversewords+" ";
		}
		System.out.println(reversestring);
		

		
		
		
	}

}
