public class InputFileLoad {
    public static void main(String[] args) {

        String filename = "data.txt";
        In songFile = new In(filename);

        double num1 = songFile.readDouble();
        double num2 = songFile.readDouble();
        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, (num1+num2));
    }
}
