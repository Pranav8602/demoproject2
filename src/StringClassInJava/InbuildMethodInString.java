package StringClassInJava;

public class InbuildMethodInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Inbuild method /function in String class
		
		String s1="John Doe";
		String s2="Java";
		
		boolean var = s1.isEmpty();
		System.out.println(var);
		
		Object i=s1.length();
		System.out.println(i);//8
		
		
		String str =s1.toUpperCase();
		System.out.println(str);//JOHN DOE
		
		System.out.println(s1.toLowerCase());//john doe
		
		System.out.println(s1.charAt(3));//n
		
		System.out.println(s1.codePointAt(2));
		
		System.out.println(s1.indexOf(4));
		
		System.out.println(s1.startsWith("java"));
		
		System.out.println(s1.endsWith("pers "));	
		
		System.out.println(s1.concat("automation"));
		
		System.out.println(s1.substring(4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
