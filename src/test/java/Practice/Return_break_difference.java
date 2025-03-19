package Practice;

public class Return_break_difference {

	// return
	 // Method to print numbers up to a certain limit
    public void printNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
            if (i == 5) {
            	//break; it prints the "End of method"
               return; // Exit the method when i equals 5
               
            }
            System.out.println("Success" +i);

        }
        System.out.println("End of method"); // Return: This line will not be reached if i equals 5
    }

    public static void main(String[] args) {
    	Return_break_difference example = new Return_break_difference();
        example.printNumbers(10);
    }
}

//
