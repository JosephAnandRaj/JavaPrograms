package Variables;

public class Addition{

	int a;
	int b;


	public void add(int a,int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	public void sub(int c,int d) {
		int sub = a-b-c-d;
		System.out.println(sub);
	}
	
	public static void main(String args[]) {
		Addition a = new Addition();
		a.add(2,3);
		a.sub(1, 2);
	}



}

