public class Square {

    public static void Square(double x) {
        x = x * x;
        System.out.println("In fun: " + x);
    }

    public static void main(String[] args) {
        double x = 5;
        Square(x);
        System.out.println(x);
    }
}
