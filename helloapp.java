
public class helloapp {

    public static void main(String[] args) {

        if (args.length > 0) {
            // Join all arguments with space
            String name = String.join(" ", args);
            System.out.println("Hello " + name);
        } else {
            System.out.println("Hello User");
        }

    }

}