public class Factorial {

    public static int factorial(int n) {
        if (n > 0) {
            int val = n * factorial(n-1);
            return val; 
        }
        return 1;
    }

    public static int ifactorial(int n) {
        int product = 1;
        for (int i = n; i > 0; i--) {
            product = product * i;
        }
        return product;
    }

    public static void main(String[] args) {

        int input = Integer.parseInt(args[0]); 
        System.out.println("recursive: "+factorial(input));
        System.out.println("iterative: "+ifactorial(input));
    } 
}
