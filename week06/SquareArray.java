public class SquareArray {
    public static void squareArray(double[] L) {
        for (int i = 0; i < L.length; i++) {
            L[i] = L[i] * L[i];
        }
        System.out.println("In fun: "+java.util.Arrays.toString(L));
    }
    
    public static void main(String[] args) {
        double[] values = {1.0, 2.5, 4.0, 5.7, 7.0}; 
        System.out.println(java.util.Arrays.toString(values));
        squareArray(values);
        System.out.println(java.util.Arrays.toString(values));
    } 
}
