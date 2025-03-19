package Polymorphism;;

public class Methodoverride2 extends Methodoverride1 {

	@Override
	public void Car() {
		
		  String Model = "Benz"; 
		  int Price = 100000; 
		  System.out.println("Model is = "+Model); 
		  System.out.println("Price is = "+Price);
		  }
	public void price() {
		System.out.println("2 crore");
	}
	
	public void add(int b,int a) {
		int sum = a+b;
		System.out.println("The Total is: "+sum);
	}
	
	public static void main (String args []) {
		Methodoverride1 W = new Methodoverride2();
		W.Car();
		W.colour();
		W.price();
		W.add(10, 20);
		Methodoverride2 B = new Methodoverride2();
		B.add(9, 8);

	}
}
