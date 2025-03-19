package Encapsulation;

public class Dad {

	String car1 = "Toyata";
	public String car2 = "Maruthi";
	private String car3 = "Vintage Benz";
	protected String car4 = "Rolls Royce";

	void a() {
		System.out.println("Default ="+car1);
	}
	
	public void b() {
		System.out.println("public = "+car2);
	}
	
	private void c() {
		System.out.println("private = "+car3);
	}
	
	protected void d() {
		System.out.println("protected = "+car4);
	}

	public static void main(String args[]) {
		Dad d = new Dad();
		d.a();
		d.b();
		d.c();
		d.d();
		

	}



}