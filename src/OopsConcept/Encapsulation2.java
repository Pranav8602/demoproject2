package OopsConcept;

public class Encapsulation2 {
	
	private double accbalance;
	
	
	//getter method for accbalance name
	public double getaccbalance()
	{
		return accbalance;
		
	}

	//setter method for accbalance name
	public void setaccbalance(double accbalance)
	{
		this.accbalance=accbalance;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Encapsulation2 E= new  Encapsulation2();
		E.setaccbalance(10);
		double var=E.getaccbalance();
		System.out.println(var);
		
	}

}
