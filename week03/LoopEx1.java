public class LoopEx1 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 1;
        while (count < 3) {
            sum = sum + 2;
            count = count + 1;
        }
        System.out.println("The sum is "+sum);
    }
}
