public class IsInteger {
    
    public static void main(String[] args) {
        String test = args[0]; 
        boolean result = Utilities.IsInteger(test);
        System.out.printf("isInteger(%s) = %b\n", test, result);
    } 
}

