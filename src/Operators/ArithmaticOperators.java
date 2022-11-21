package Operators;

public class ArithmaticOperators {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//1) Arithmatic operators
		int a=10;
		int b=20;
		
	    //	boolean c=b<a;
		
		System.out.println("Addition:"+(a+b));
		System.out.println("subtraction:"+(b-a));
		System.out.println("multiplication:"+(b*a));
		System.out.println("division:"+(b/a));
		
		Thread.sleep(3000);
		//2) Relational operators
		//relational operators will always run boolean value
		
		System.out.println("below are reletional operators");
		System.out.println(a==b);// false
		System.out.println(a!=b);//--true
		System.out.println(a<b); //true
		System.out.println(b<a);//false
		System.out.println(a>b);///false
		System.out.println(a>=b);//false
		
		//3) Logical operators
		//Logical operators always show true or false
		
//		boolean var1=true;
//		boolean var2=false;
//		boolean var3=true && false; //ampersand symbol
//		
//		System.out.println("below are logical operators");
//		System.out.println(true && true);
//		System.out.println(true && false);
//	    System.out.println(false && true);
//	    System.out.println(false && false);
//	    
//	    System.out.println("or logical operator");
//	    System.out.println(true || true);
//	    System.out.println(true || false);
//	    System.out.println(false || true);
//	    System.out.println(false || false);
//	    
//	    System.out.println("not logical operators");
//	    System.out.println(!true);//false
//        System.out.println(!false);//true		
        
        
        boolean var1=true;
        boolean var2=false;
        
        boolean var3= true && false;
        
        System.out.println("AND logical operator");
        System.out.println(true && true); //in and operator if both condition are true then only it will return true else false "and"--one false all false
        System.out.println(true && false);//false
        System.out.println(false&&true);//false
        System.out.println(false && false);//false
        
        //or operator
        System.out.println("or operators");
        System.out.println(true || true); //in or operator if both condition are true then true -"or"atlist one true in statement it will show true
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        System.out.println(false|| false);//false
        
        System.out.println("not operators");
        System.out.println(!true);//false
        System.out.println(!false);//true
        
        //increment operators
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
