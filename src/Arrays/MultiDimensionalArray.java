package Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//multi-dimensional array
		int [][] array = new int [3][2];
		
		array[0][0]=100;
		array[0][1]=200;
		array[1][0]=300;
		array[1][1]=400;
		array[2][0]=500;
		array[2][1]=600;
		
		System.out.println("size of row:"+array.length);
		System.out.println("size of column:"+array[0].length);
		System.out.println(array[0][0]);
		System.out.println(array[1][1]);
		
		for(int row=0;row<array.length;row++)
		{
			for (int col=0;col<array[row].length;col++)
			{
				System.out.println(array[row][col]);
			}
		}
		
		
		//multi-dimensional array-Method2
		//double data type should be used for multidimensional aaray to have row column in int range
		
		double a[][]= {{100,200,300},{400,500,600},{700,800,900}};
		
		System.out.println("row size:"+a.length);
		System.out.println("col size:"+a[0].length);
		
		for(int row = 0;row<a.length;row++)
		{
			for(int col = 0;col<a[0].length;col++)
			{
				System.out.println(a[row][col]);
			}
		}
		
		//MultiDimensional object array
		
		//Object data type should be use if there is so many type of int,string char
		Object a1 [][]=  {{100,true,'c'},{200,false,"RJ"},{300,'C',true}};
		
		System.out.println("size of row:"+a1.length);
		System.out.println("size of column:"+a1[0].length);
		
		for(int row = 0;row<a1.length;row++)
		{
			for(int col=0;col<a1[0].length;col++)
			{
				System.out.println(a1[row][col]);
			}
		}
		
		
		
		
		
		
	}

}
