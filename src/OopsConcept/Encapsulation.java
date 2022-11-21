package OopsConcept;

public class Encapsulation {

	private double accbalance;
	
	//getter method for accbalance
	public double getAccbalance()
	{
		return accbalance;
	}
	
	
	//setter method for accbalance
	public void setAccbalance(double accbalance)
	{
		this.accbalance =accbalance;
	}
	
	
	public static void main(String[] args) {
		
		Encapsulation E=new Encapsulation();
		E.setAccbalance(10);
        double var = E.getAccbalance();
		System.out.println(var);
	}

}
