public class VariableDemo {

    static String globalMessage = "I am a Global Variable";

    public static void main(String[] args) {
        
        int localNumber = 10;

        System.out.println("--- Accessing Variables ---");
        
        System.out.println("Local Variable: " + localNumber);

        System.out.println("Global Variable: " + globalMessage);
        
        printGlobalAgain();
    }

    public static void printGlobalAgain() {
       
        System.out.println("Global Variable (from another method): " + globalMessage);
    }
}