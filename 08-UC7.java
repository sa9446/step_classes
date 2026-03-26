public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            String delimiter = ", ";
            String namesList = String.join(delimiter, args);
            System.out.println("Hello, " + namesList + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
 
