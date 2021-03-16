public class Triangle {
    
    public static void drawTriangle(double x0, double y0, 
                                    double x1, double y1,
                                    double x2, double y2) {
        StdDraw.line(x0, y0, x1, y1);
        StdDraw.line(x1, y1, x2, y2);
        StdDraw.line(x0, y0, x2, y2);
    }

    public static void main(String[] args) {
        drawTriangle(0, 0, 1, 0.5, 0, 1);

    }    
}
