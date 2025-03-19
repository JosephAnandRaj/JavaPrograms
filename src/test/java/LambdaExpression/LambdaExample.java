package LambdaExpression;

import java.util.ArrayList;

public class LambdaExample {
	

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Joseph");
		names.add("Anand");
		names.add("Raj");
		
		String[] Array = names.(name -> name = "Raj");
	}

}
