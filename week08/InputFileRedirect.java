public class InputFileRedirect {
    
    public static void main(String[] args) {

        double num1 = StdIn.readDouble();
        double num2 = StdIn.readDouble();
        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, (num1+num2));
    }

}
