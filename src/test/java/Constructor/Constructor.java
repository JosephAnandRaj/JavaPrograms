package Constructor;

public class Constructor {

	String name = "Benz";
	String colour = "Red";

	public Constructor(String name, String colour){
		this.name = name;
		this.colour = colour;
	}

	void display(){

		System.out.println("Car Name is = "+name +" and Color is = "+colour);
	}
	
	void display1(){

		System.out.println("Car Name is = "+name +" and Color is = "+colour);
	}
	
	public static void main(String[] args) {
		
		Constructor C = new Constructor("RollsRoyce","Red");
		C.display();
		C.display1();
	}
}
