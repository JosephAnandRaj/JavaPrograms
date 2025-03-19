package Returntype;

public class Person{

	int Eng = 100;
	int Tam = 95;
	
	public String Name() {
		return "Joseph" ;
	}
	public int Marks() {
		int sum = Eng+Tam;
		return sum;
	}
	public void age() {
		System.out.println("Age is 25");
	}
	
	public static void main(String args[]) {
		Person p = new Person();
        String Topper = p.Name();
        String Pupil = p.Name();
    //  Void cannot be used as a result of a variable
    //  String Topper = p.age();
		System.out.println("Our Topper is: "+Topper);
	    System.out.println("Our school pupil leader is: "+Pupil);
         System.out.println(Name);

	}
}