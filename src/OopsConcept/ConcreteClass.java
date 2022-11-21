package OopsConcept;

public  class ConcreteClass extends AbstractClass {




	
	
		


	@Override
	void startvechile() {System.out.println("startvechile");
		// TODO Auto-generated method stub
		
	}

	@Override
	void stopvechile() {System.out.println("stopvechile");
		// TODO Auto-generated method stub
		
	}

	@Override
	void refule() {System.out.println("refuel");
		// TODO Auto-generated method stub
		
	}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		ConcreteClass A=new ConcreteClass ();
		A.test();
		A.startvechile();
		A.stopvechile();
		A.refule();

		
		
	}

}
