package Practice;

public class Test {

	int a = 10;
	int b = 20;
	int c = 30; int d = 40;
	
	public void ifelse() {
		if(a<b) {
			System.out.println("Print a");
		}
		else {
			System.out.println("Print Fail");
		}
		if(a<b) {
			System.out.println("Print c");
		}
		if(d>c) {
			System.out.println("Prin d");
		}
	}
	
	
	public static void main(String[] args) {
		Test t = new Test();
		t.ifelse();
	}

}
