public class AskUserNoLoop {
    public static void main(String[] args) {

        int sum = 0;
        String input = ""; // initialize to empty string
        int val = 0;

        System.out.print("Enter a number: ");
        input = System.console().readLine();
        val = Integer.parseInt(input);
        sum = sum + val;

        System.out.print("Enter a number: ");
        input = System.console().readLine();
        val = Integer.parseInt(input);
        sum = sum + val;

        System.out.print("Enter a number: ");
        input = System.console().readLine();
        val = Integer.parseInt(input);
        sum = sum + val;

        System.out.print("Enter a number: ");
        input = System.console().readLine();
        val = Integer.parseInt(input);
        sum = sum + val;

        System.out.print("Enter a number: ");
        input = System.console().readLine();
        val = Integer.parseInt(input);
        sum = sum + val;

        System.out.print("Enter a number: ");
        input = System.console().readLine();
        val = Integer.parseInt(input);
        sum = sum + val;

        System.out.println("The sum is "+ sum);

    } 
}
