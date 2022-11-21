package Logicalcodes;

public class CountEvenandOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numb=1234678910;
		int evenno=0;
		int oddno=0;
		
		while(numb!=0)
		{
			int rem=numb%10;
			if(rem%2==0)
			{
				evenno++;
			}
			else
			{
				oddno++;
			}
			numb=numb/10;
		}
		System.out.println("even nos are :"+evenno);
		System.out.println("odd nos are:"+oddno);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
