package AccessModifiersProtected;

import AccessModifiers.ProtectedClass;

public class ProtectedClass2 extends ProtectedClass  {

	
	//Protected- Protected is accessable within class,outside class ,and outside package also
	//but for outside package we need to use use extend keyword and after that 
	//we have to import that package.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProtectedClass2 P = new ProtectedClass2();
		System.out.println(P.a);
		P.test();
		
		
		
		
		
		
		
		
	}

}
