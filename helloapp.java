public class helloapp {

    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Join all names with ", " as delimiter
        String joinedNames = String.join(", ", args);

        // Print greeting
        System.out.println("Hello, " + joinedNames + "!");
    }

}