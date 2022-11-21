package KeywordsInJava;

public class StaticKeyword {


	int empno;
	String ename;
	static int empid=10;
	
	void display()
	{
		System.out.println("EMPLOYEE NAME IS:"+ename);
		System.out.println("EMPLOYEE NUMBER IS:"+empno);
		System.out.println("EMPLOYEE ID:"+empid);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("emloyee1 data");
		StaticKeyword emp1=new StaticKeyword();
		emp1.ename="John";
		emp1.empno=101;
		emp1.display();
		
		
		System.out.println("Employee 2 data");
		StaticKeyword emp2 = new StaticKeyword();
		emp2.ename="doe";
		emp2.empno=102;
		emp2.display();
	}

}
