public class helloapp {

    public static void main(String[] args) {
        String name = "ATMAN";

        if(args.length>0){
            name = args[0];
        }
        System.out.println("Hello, " + name + "!");
    }

}