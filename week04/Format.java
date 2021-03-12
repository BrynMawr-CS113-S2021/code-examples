public class Format {
    public static void main(String[] args) {
        System.out.println("Hello World");  // Uses core Java utilities: javac/java
        StdOut.println("Hello World");  // Uses textbook Java to print: javac-introcs/java-introcs
        
        int value = -76;
        StdOut.printf("Format: %8d\n", value);

        double cost = 9.9;
        StdOut.printf("Cost: $%.2f\n", cost);

        StdOut.printf("This %s has multiple: %d %f\n", "test", value, cost);
    } 
}
