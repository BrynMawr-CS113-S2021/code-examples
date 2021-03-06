// Ask the user for an exponent
// Output 2^ exponent
// Example: 
// Enter an exponent: 3
// 2 to the power of 3 is 8

public class LoopPow2 {
    public static void main(String[] args) {
        System.out.print("Enter an exponent: ");
        int exp = Integer.parseInt(System.console().readLine());

        // your code here
        int count = 0;
        int product = 1;
        while (count < exp) {
            product *= 2;
            count++;
        }

        System.out.println("2 to the power of "+exp+" is "+product);
    }    
}
