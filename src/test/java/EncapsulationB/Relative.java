package EncapsulationB;

import Encapsulation.Dad;

public class Relative extends Dad{

	public static void main(String[] args) {

		Relative R = new Relative();
		R.b();
//Protected method and variable can be accessed using inheritance
	    R.d();
	    
	   Dad d = new Dad();
	   d.b();
	}
}