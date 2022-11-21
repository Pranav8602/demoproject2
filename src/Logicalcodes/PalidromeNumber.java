package Logicalcodes;

public class PalidromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int numb=101;
//		int org=numb;
//		int rev=0;
//		
//		while(numb!=0)
//		{
//			rev=rev*10+numb%10;
//			numb=numb/10;
//		}
//		System.out.println("original number is:"+org);
//		System.out.println("reverse number is:"+rev);
//		
//		if(org==rev)
//		{
//			System.out.println("Given number is palidrome number");
//		}
//		else
//		{
//			System.out.println("given number is not palidrome number");
//		}
//		
//		
//		
		
		int numb=101;
		int org=numb;
		int rev=0;
		
		while(numb!=0)
		{
			rev=rev*10+numb%10;
			numb=numb/10;
		}
		System.out.println("giver number is orginal"+org);
		System.out.println("given reverse number is"+rev);
		
		if(org==rev)
		{
			System.out.println("given number is palidrome");
		}
		else
		{
			System.out.println("given number is not a plidrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
