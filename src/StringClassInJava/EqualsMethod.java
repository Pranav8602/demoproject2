package StringClassInJava;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constant pool Area //without using  new keyword- Duplicates are not allowed.
				String str1="RJ";
				String str2="RJ";
				
				//Non- Constant Pool Area//With using new keyword.
				String str3=new String ("RJ");
				String str4=new String ("RJ");
				
				
				System.out.println(str1.equals(str1));
				System.out.println(str1.equals(str2));
				System.out.println(str2.equals(str4));
				System.out.println(str1.equals("rj"));
		
		
		//equals Method
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
