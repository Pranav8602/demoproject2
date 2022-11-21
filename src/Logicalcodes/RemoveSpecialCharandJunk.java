package Logicalcodes;

public class RemoveSpecialCharandJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="@#$$%^^&&**welcome to java";
		System.out.println("before removing junk:  "+str);
		
		
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("after removing junk"+str);
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
