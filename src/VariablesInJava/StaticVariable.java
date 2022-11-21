package VariablesInJava;

public class StaticVariable {
	
 static int i =2;
 void test(int var) 
 
 //local variable
 {
	 int i;
 }
 
	

	//instance variable
	String str ="john";
	boolean b=true;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(StaticVariable.i);
		StaticVariable s = new StaticVariable();
		System.out.println(s.b);
		System.out.println(s.str);
		
	}

}
