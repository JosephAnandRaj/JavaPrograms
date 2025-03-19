package Inheritance;

public class Jaguar extends BMW {

	public void Price () {
		System.out.println("This is jaguar price!...");
	}
	
	public static void main (String[]args) {
		Jaguar w = new Jaguar();
		w.Price();
		w.colour();
		w.engine();
		
		
}}
