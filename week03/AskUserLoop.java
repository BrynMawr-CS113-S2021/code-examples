public class AskUserLoop {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        while (count < 6) {
            System.out.println("Enter a number: ");
            String input = System.console().readLine();
            int val = Integer.parseInt(input);
            sum = sum + val;

        }

        System.out.println("The sum is "+ sum);
    }    
}
