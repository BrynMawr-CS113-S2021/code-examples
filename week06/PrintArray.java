import java.util.*; // * means wildcard, e.g. import everything in java.util

public class PrintArray {
    public static void main(String[] args) {
        char[] test = {'h', 'e', 'l', 'l', 'o'};

        // Because we import java.util, we can just use Arrays here
        System.out.println(Arrays.toString(test));
    } 
}
