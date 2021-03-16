public class Area {

    // Function: area
    // Description: computes the area of a rectangle
    // Input: width (double)
    // Input: height (double)
    // returns (double), the area as width * height
    public static double area(double width, double height) {
        return width * height; 
    }

    public static void main(String[] args) {

        double size = area(10.0, 5);
        System.out.println("Area is "+ size);
    }    
    
}