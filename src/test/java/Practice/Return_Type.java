package Practice;

public class Return_Type {


	/*
	 * public void car() { System.out.println("s"); }
	 * 
	 * public String bike() { return "bike"; }
	 * 
	 * public int addNumbers(int num1, int num2) { return num1 + num2; } public
	 * static void main(String[] args) {
	 * 
	 * Return_Type Mycar = new Return_Type(); Mycar.car(); String bike =
	 * Mycar.bike(); int value = Mycar.addNumbers(10, 12); System.out.println(bike);
	 * 
	 * }
	 */
	
	public int Total (int a,int b, int c, int d, int e) {
		return a+b+c+d+e;
		}
	public double average1 (int Total1) {
		return (double) Total1 / 500;
	}
	public double average2 (double cal1 ) {
		return cal1 * 100;
	}
	
	public static void main (String args[])
	{
		Return_Type Waiter = new Return_Type();
		int Total1 = Waiter.Total(98, 75, 98, 95, 89);
		double Cal1 = Waiter.average1(Total1);
		double percentage = Waiter.average2(Cal1);
		int ipercentage = (int)percentage;
		System.out.println("Total of 10th Marks is = "+Total1);
		System.out.println(Cal1);
		System.out.println("Average of Joseph 10th marks is = " +ipercentage);
	}

}
