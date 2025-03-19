package Inheritance;

public class BMW extends Car {

	public void colour() {
		System.out.println("This is BMW Colour!....");
	}
	
	public static void main (String[]args) {
    BMW waiter = new BMW();
	waiter.engine();
	
}}