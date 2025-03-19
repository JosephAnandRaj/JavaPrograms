package SuperKeyword;

public class Anand extends Joseph {
	
	public Anand(){
	super(); // Calls parent constructor
	super.act();
	}
	@Override
	public void act() {
		super.act(); // Calls parent method
		System.out.println("Anand is Acting");
	}

	public void height () {
		System.out.println("Anand Height is 5.8");
	}
	public void s () {
		System.out.println(super.name);
	}



	public static void main(String[] args) {

		//Calling Child class and parent class methods (Excluding overridden method) 		
		Anand a = new Anand(); 
		a.act();
		a.height();
		a.salary();
		a.s();
		//Calling Parent class method which overridden from child class
	//	Joseph j = new Joseph();
	//	j.act(); 







	}

}
