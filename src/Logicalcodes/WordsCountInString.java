package Logicalcodes;

import java.util.Scanner;

public class WordsCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		System.out.println("Enter the string:");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		String s= sc.nextLine();
//		
//		int count=1;
//		for(int i=0;i<s.length();i++)
//		{
//			if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
//					{
//				count ++;
//					}
//		}
//		
//		System.out.println("size of words: "+count);
//		
		
		
//		
//		System.out.println("Emter the string:");
//		
//		Scanner sc = new Scanner (System.in);
//		
//		String str=sc.nextLine();
//		
//		int count=1;
//		for(int i=0;i<str.length();i++)
//		{
//			
//			if((str.charAt(i)==' ') && (str.charAt(i+1))!=' ')
//{
//	count++;
//}
//
//		}
//		System.out.println("size of string is:"+count);
//		
		
		
		
		System.out.println("Enter string");
		
		Scanner sc =new Scanner (System.in);
		
		String str =sc.nextLine();
		
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if ((str.charAt(i)==' ') && (str.charAt(i+1))!=' ')
{
	count++;
}
		}
		
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
