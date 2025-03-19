package StringBuilder;

public class stringbuilderexample {
	
	String Topper = "Joseph";
	
	public void append() {
		StringBuilder sb = new StringBuilder(Topper);
		sb.append(" Anand");
		System.out.println("Append Anand after Joseph: "+sb);
	}
	
	public void reverse() {
		StringBuilder sb = new StringBuilder(Topper);
		sb.reverse();
		System.out.println("Reverse: "+sb);
		}
	
	public void insert() {
		StringBuilder sb = new StringBuilder(Topper);
		sb.insert(5, "s");
		System.out.println("insert S before H: "+sb);
	}
	
	public void delete() {
		StringBuilder sb = new StringBuilder(Topper);
		sb.delete(1, 3);  // does not delete end index
		System.out.println("Delete os: "+sb);
	}
	
	public void replace() {
		StringBuilder sb = new StringBuilder(Topper);
		sb.replace(1, 3, "er");
		System.out.println("Replace os: "+sb);
	}
	public static void main(String[] args) {
		stringbuilderexample s = new stringbuilderexample();
		s.append();
		s.reverse();
		s.insert();
		s.delete();
		s.replace();
	}

}
