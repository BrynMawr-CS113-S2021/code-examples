public class InputConsole {
    
    public static void main(String[] args) {
        System.out.print("Enter a num1: ");
        String str1 = System.console().readLine();
        double num1 = Double.parseDouble(str1);

        System.out.print("Enter a num2: ");
        String str2 = System.console().readLine();
        double num2 = Double.parseDouble(str2);

        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, (num1+num2));
    }
    
}
