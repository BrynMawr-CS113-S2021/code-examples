public class Square {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int N = Integer.parseInt(System.console().readLine());

        // your program here
        for (int i = 0; i < N; i++) {
            String line = "";
            for (int j = 0; j < N; j++) {
                line += "*";
            }
            System.out.println(line);
        }
    } 
}
