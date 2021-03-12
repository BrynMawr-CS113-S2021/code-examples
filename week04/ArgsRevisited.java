public class ArgsRevisited {
    public static void main(String[] args) {
        // todo: print out the command line arguments to the console
        for (int i = 0; i < args.length; i++) {
            System.out.printf("Argument #%d: %s\n", (i+1), args[i]);
        }
    } 
}
