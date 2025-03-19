package Interface;

public class BMW implements Car,Bike {

	public static void main(String[] args) {
		BMW w = new BMW();
		w.BikeEngine();
		w.Carengine();
	}

	@Override
	public void BikeEngine() {
		System.out.println("This is BMW Bike Engine!.....");
		System.out.println(bikePrice);
		System.out.println(bikecolour);
	}

	@Override
	public void Carengine() {
		System.out.println("This is BMW Car Engine!.....");
	//	System.out.println(carPrice);

	}

	@Override
	public void Carseat() {
		// TODO Auto-generated method stub
		
	}

	

}
