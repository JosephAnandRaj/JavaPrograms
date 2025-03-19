package Practice;

import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) {

		String Name = "Joseph"; 
		
		/*
		 * if (Name.equals("joseph")) { System.out.println("Name is Equal"); } else {
		 * System.out.println("Not Equal"); }
		 */
		
		Assert.assertEquals(Name, "Joseph")
	}

}
