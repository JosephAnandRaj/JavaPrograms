package Abstraction;

public class BMW extends car {

// Need to implement the unimplemented abstract methods
	@Override
	public void engine() {
		System.out.println("This is BMW Engine!.....");
	}
	
	
	public static void main(String[] args) {
	BMW W = new BMW();
	W.engine();
	W.bike();

	}
	
}
