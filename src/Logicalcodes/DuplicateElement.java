package Logicalcodes;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String a[]= {"java", "boole","john","java","RJ","DOE"};
		
		boolean flag=false;
		for(int i = 0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
				
			{
				   if(a[i]==a[j])
				       
				       {    System.out.println("Duplicate elemnt found:        "+a[i]);
			                flag=true;
		               }
                     }
		           }
		
		
		if(flag==false)
		{
			System.out.println("Duplicate element not found");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
