public class Triangle {
    
    public static void drawTriangle(double x0, double y0, 
                                    double x1, double y1,
                                    double x2, double y2) {
        StdDraw.line(x0, y0, x1, y1);
        StdDraw.line(x1, y1, x2, y2);
        StdDraw.line(x0, y0, x2, y2);
    }

    public static void main(String[] args) {
        double ax = 0;
        double ay = 0;
        double bx = 1;
        double by = 0.5;
        double cx = 0;
        double cy = 1;

        for (int i = 0; i < 3; i++)
        {
            drawTriangle(ax, ay, bx, by, cx, cy);
            ax += 0.1;
            ay += 0.1;
        }

    }    
}
