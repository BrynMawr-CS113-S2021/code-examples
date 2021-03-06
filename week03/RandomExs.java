public class RandomExs {
    public static void main(String[] args) {
        double d = Math.random(); // returns [0, 1)

        int range = 21;
        int minValue = 1;

        int a = (int) (d * range);  // returns [0, 10)
        int b = (int) (d * range) + minValue;  // returns [1, 11)
        System.out.println(b);

    } 
}
