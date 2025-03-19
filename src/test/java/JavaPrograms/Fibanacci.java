package JavaPrograms;

public class Fibanacci {
	
	int n = 10;
	int first = 0;
	int second = 1;
	int third = 0;
	
	public void method() {
		
		for(int i=0;i<n;i++) {
		  System.out.println(first);
		  third = first+second;
		  first = second;
		  second = third;
		}
	}


	public static void main(String[] args) {
		Fibanacci f = new Fibanacci();
		f.method();
		
	}

}
