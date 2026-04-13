public class helloapp {

    public static void main(String[] args) {
        
        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use StringBuilder to build the greeting
        StringBuilder names = new StringBuilder();

        // Enhanced for loop to process multiple names
        for (String name : args) {
            names.append(name).append(", ");
        }

        // Remove trailing ", " using substring
        String result = names.substring(0, names.length() - 2);

        // Print final greeting
        System.out.println("Hello, " + result + "!");
    }

}