// Be careful: printing is not the same as returning a value
// AreaPrint.java has the same behavior as Area.java, but is not the same
public class AreaPrint {
    
    // Function: area
    // Description: computes the area of a rectangle
    // Input: width (double)
    // Input: height (double)
    // returns (none)
    // Side effect: prints the area to the console
    public static void area(double width, double height) {
        double a = width * height; 
        System.out.println("Area is "+ a);
    }

    public static void main(String[] args) {
        area(10.0, 5);
    }   
}
