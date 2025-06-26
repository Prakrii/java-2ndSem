public class CommandLineExample {
    public static void main(String[] args){
        //check if any arguments were passed 
        if (args.length==0){
            System.out.println("No arguments passed.");
        }
        else {
            // Print each argument on a new line
            for (String arg: args){
                System.out.println(arg);
            }
        }
    }
}
