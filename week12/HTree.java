class HTree {

    public static void htree(int n, double size, double x, double y) {

        if (n <= 0) return;

        double x0 = x - size/2.0;
        double x1 = x + size/2.0;

        double y0 = y - size/2.0;
        double y1 = y + size/2.0;

        StdDraw.line(x0, y, x1, y);
        StdDraw.line(x0, y0, x0, y1);
        StdDraw.line(x1, y0, x1, y1);

        htree(n-1, size/2, x0, y1);
        htree(n-1, size/2, x0, y0);
        htree(n-1, size/2, x1, y1);
        htree(n-1, size/2, x1, y0);
    }

    public static void main(String[] args) {
        htree(4, 0.5, 0.5, 0.5);
    }
}