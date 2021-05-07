public class Triangle {
    
    public static void triangle(int n, 
        double x0, double y0, double x1, double y1, double x2, double y2) {

        if (n <= 0) return;

        StdDraw.line(x0, y0, x1, y1);
        StdDraw.line(x0, y0, x2, y2);
        StdDraw.line(x1, y1, x2, y2);

        double xLeft = 0.5 * (x0 + x2);
        double xRight = 0.5 * (x1 + x2);
        double xBottom = 0.5 * (x1 + x0);

        double yLeft = 0.5 * (y0 + y2);
        double yRight = 0.5 * (y1 + y2);
        double yBottom = 0.5 * (y1 + y0);

        triangle(n-1, xLeft, yLeft, xRight, yRight, x2, y2);
        triangle(n-1, x0, y0, xBottom, yBottom, xLeft, yLeft);
        triangle(n-1, xBottom, yBottom, x1, y1, xRight, yRight);
        
    }
    
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        triangle(n, 0, 0, 1, 0, 0.5, 1);
    } 
}
