public class InputCommandLine {
    public static void main(String[] args) {
        if (args.length < 2)
        {
            System.out.println("Usage: InputCommandLine <num1> <num2>");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, (num1+num2));
    }
}
