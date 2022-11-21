package ScannerClass;

import java.util.Scanner;

public class newscannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		System.out.println("what is your name");
		String name = sc.nextLine();
		System.out.println("hello "+name);
		
		System.out.println("what is your age");
		int age = sc.nextInt();
		System.out.println("my age is "+age);
		
		
		System.out.println("what is weight");
		int weight =sc.nextInt();
		System.out.println("my weight is "+weight);
		sc.close();
		
		
		
	}

}
