public class helloapp {

    public static void main(String[] args) {

        if (args.length == 0) {
            // Default message
            System.out.println("Hello, World!");
        } else {
            // Loop through each argument
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        }

    }

}