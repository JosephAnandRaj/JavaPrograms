package JavaPrograms;

public class ForEachLoop {
	
	public static void method() {
		int[] num = {1,2,3,4,5};
		for(int numbers: num) {
			System.out.println(numbers);
		}
	}
	
	public static void method2() {
		String[] Toppers = {"Joseph","Malar","Aarthi"};
		for (String Names: Toppers) {
			System.out.println(Names);
		}
	}
	
	public static void main(String[] args) {
		method();
		method2();
	}

}
