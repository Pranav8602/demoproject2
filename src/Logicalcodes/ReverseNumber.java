package Logicalcodes;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		System.out.println("Enter a number");
//		Scanner sc = new Scanner (System.in);
//		int num =sc.nextInt();
//		
//		int rev=0;
//		while(num!=0)
//		{
//			rev=rev*10 +num%10;
//			num=num/10;
//		}
//		
//		System.out.println(rev);
//		
		
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		
		int rev=0;
		while(numb!=0)
		{
			rev=rev*10+numb%10;
			numb=numb/10;
			
		}
	System.out.println(rev);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
