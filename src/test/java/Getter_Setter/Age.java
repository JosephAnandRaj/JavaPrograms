package Getter_Setter;

class Age {

	private int age = 25;

	public int getAge() {
		return age;
	}

	public void setAge(int Val) {
		
	if (Val>24) {
		age = Val;
	}else {
		System.out.println("Age must be above 24");
	}
	
	}


	
}