public class HelloApp {
    public static void main(String[] args) {
        // Check if command-line arguments are provided
        if (args.length > 0) {
            // Iterate through all provided names and greet each one
            for (int i = 0; i < args.length; i++) {
                System.out.println("Hello, " + args[i] + "!");
            }
        } else {
            // Default to "World" if no names are provided
            System.out.println("Hello, World!");
        }
    }
}
