package Static;

public class StaticBlock {
    private static String message;

    // Static block
    static {
        System.out.println("Static block executed!");
        message = "Hello from the static block!";
    }

    // Method to get the initialized message
    public static String getMessage() {
        return message;
    }

    public static void main(String[] args) {
     //   System.out.println("Main method starts!");
        // Accessing the static message
    //    System.out.println(StaticBlock.getMessage());
    }
}
