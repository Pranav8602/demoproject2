package StringClassInJava;

public class StringMutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string is immutable-that is not changeble
		//String-Immutable
		//1)
		
		String str1="RJ";
		
		str1.concat("David");
		
		System.out.println(str1);
		
		//2)
		//String Buffer-mutable i.e changeble
		
		StringBuffer sb = new StringBuffer("RJ");
		
		sb.append("David");
		
		System.out.println(sb);
		
		//3)
		//String Builder -mutable i.e changeble
		
		StringBuilder sb1 = new StringBuilder("RJ");
		
		sb1.append("David");

		System.out.println(sb1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
