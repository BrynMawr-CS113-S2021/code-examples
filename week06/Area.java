public class Area {

    public static double area(double width, double height) {

        double result = 0;
        for (int i = 0; i < 5; i++) {
            result = width * height; 
        }
        return result;
    }

    public static void main(String[] args) {

        double size = area(10.0, 5);
        System.out.println("Area is "+ size);
    }    
    
}
