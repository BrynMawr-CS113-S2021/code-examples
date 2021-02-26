public class HeightNoElseIf {
   public static void main(String[] args) {
        System.out.print("Enter a height (inches): ");
        int h = Integer.parseInt(System.console().readLine());

        // All if statements execute
        // What is the output when h = 72 ?
        if (h > 60) {
            System.out.println("Taller than 5 ft");
        }
        if (h > 48) {
            System.out.println("Taller than 4 ft");
        }
        if (h > 36) {
            System.out.println("Taller than 3 ft");
        }
        else {
            System.out.println("Too small for this ride");
        }
   } 
}
