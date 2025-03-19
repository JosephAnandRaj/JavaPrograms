package Interface2;

public class Main {

	public static void main(String[] args) {
        Car myCar = new Sedan("Toyota Camry");

        // Use the Car interface methods
        myCar.startEngine();
        myCar.drive();
        myCar.stopEngine();
	}

}
