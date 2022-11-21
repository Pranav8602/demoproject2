package AllJavaProgramFrequntlyAskedCode;

public class ReverseString {

	public static String main(String s ) {
		
//	String input ="MKT";
//	String output="";
//	
//	for(int i = input.length()-1;i>=0;i--) 
//
//		output=output + input.charAt(i);
//		System.out.println(output);
//		
//		String str="Java is my favorite programming language";
//		
//		String s[] =str.split("");
//		for(int i=0;i<s.length;i++)
//		
//			System.err.print(s[i]+" ");
//		
//	System.out.println("");
//for(int i=s.length-1;i>=0;i--)
//
//	System.err.print(s[i]+" ");

		
//		String input ="Hellowjava";
//		String output="";
//
//		for(int i=input.length()-1;i>=0;i--)
//
//
//		 output=output+input.charAt(i);
//		 System.out.println(output);
//	//System.out.println();
//		
//		
		String p= "welcome java";	
//		String o ="";
//		
		StringBuilder result =new StringBuilder();
		for(int i=0; i<s.length()-1;i--)
		{
			if(s.charAt(i)== ' ') continue;
			int start =i;
			
			while(i<s.length() && s.charAt(i) != ' ') i++;
			if(result.length() == 0) result.insert(0, s.substring(start, i));
			else result.insert(0, " ").insert(0, s.substring(start, i))
;		}
		
		return result.toString();
		
		
		
		
		
	}

}
