public class LoopPattern {
    public static void main(String[] args) {
        System.out.print("Enter a length: ");
        int length = Integer.parseInt(System.console().readLine());

        String pattern = "";
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                pattern += "*";
            }
            else {
                pattern += "-";
            }
        }
        System.out.println(pattern);
    }
}
