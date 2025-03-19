package Practice_2;

public class Student_Grade_Calculator {

	public void student_score(int M, int S, int E) {
		
		double Sum = M+S+E;
		double Average = Sum/300*100;
		int Average1 = (int)Average;
		System.out.println("Average Score = " +Average1);
		
		char grade;
	  if (Average1 >=90) {
		  grade = 'A';
	  }else if (Average1 >=80) {
		  grade = 'B';
	  }
	  else if (Average1 >=70) {
		  grade = 'C';
	  }
	  else if (Average1 >=60) {
		  grade = 'D';
	  }
	  else {
		  grade = 'F';
	  }
	  
	  System.out.println("Grade = "+grade);
	  
}
					
	public static void main (String arges[]) {
		Student_Grade_Calculator S = new Student_Grade_Calculator();
		S.student_score(100, 80, 90);
	}
}
