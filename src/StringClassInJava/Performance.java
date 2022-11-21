package StringClassInJava;

public class Performance {


	public static String concatwithstring()
	{
		String t="java";
		for(int i=0;i<1000;i++)
		{
			t = t+"Tpoint";
		}
		return t;
	}
	
	public static String concatwithstringbuffer()
	{
		StringBuffer sb = new StringBuffer("Java");
		for (int i=0;i<1000;i++)
		{
			sb.append("Tpoint");
		}
		return sb.toString();
	}
	
	public static String concatwithstringbuilder()
	{
		StringBuffer sb1 = new StringBuffer("Java");
		for (int i=0;i<1000;i++)
		{
			sb1.append("Tpoint");
		}
		return sb1.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    long starttime = System.currentTimeMillis();
    concatwithstring();
    System.out.println("Time taken by concating with string:"+(System.currentTimeMillis())+"ms");
    
    starttime = System.currentTimeMillis();
    concatwithstringbuffer();
    System.out.println("Time taken by concating with string buffer"+System.currentTimeMillis()+"ms");
    
    starttime = System.currentTimeMillis();
    concatwithstringbuilder();
    System.out.println("time taken by concating with string builder:"+System.currentTimeMillis()+"ms");
	
	}

}
