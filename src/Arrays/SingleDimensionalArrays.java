package Arrays;

public class SingleDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int [5];
		a[0]=15;
		a[1]=20;
		a[2]=25;
		a[3]=30;
		a[4]=35;
		
		System.out.println("size of array is:"+a.length);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		for (int i = 0; i<4;i++);
		{
			
			int i = 4;
			System.out.println(a[i]);
		}
		
		
		//Dynamic method
		int []array = {10,20,30,40,50,60,70,80,90};
		
		System.out.println("size:"+a.length);
		for (int i=0; i<9;i++)
		{
			System.out.println(array[i]);
		}
		
		
		
		
		
		
		
		
	}

}
