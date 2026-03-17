public class HelloApp {

    public static void main(String[] args) {
        String greetingTarget;

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            greetingTarget = nameBuilder.toString();
        } else {
       
            greetingTarget = "World";
        }

        System.out.println("Hello, " + greetingTarget + "!");
    }
}
