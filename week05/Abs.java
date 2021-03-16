public class Abs {
    
    public static double abs(double x) {
        if (x < 0) { 
            return -x;
        }
        return x;
    }

    public static void main(String[] args) {
        double absValue = abs(-3.4);

        double value = 4.6;
        absValue = abs(value);

        abs(value); // returned value is lost if we don't store it in a variable

        absValue = abs(Math.random()); // functions can be composed
    }    
}
