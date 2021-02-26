public class Blackjack {
    public static void main(String[] args) {

        int minVal = 2; // inclusive
        int maxVal = 22; // exclusive
        int range = maxVal - minVal;
        int sum = (int) Math.floor((Math.random() * range)) + minVal;
        System.out.println(sum);

        if (sum == 21) {
            System.out.println("Blackjack");
        }
        else if (sum >= 17) {
            System.out.println(sum + " Stand");
        }
        else { // handle case where sum < 17
            System.out.println(sum + " Hit me!");
        }
    }    
}
