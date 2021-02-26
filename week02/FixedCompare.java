public class FixedCompare {
    public static void main(String[] args) {
        String word = args[0];
        if (word.compareTo("apple") == 0) { // works!
            System.out.println("You said the word of the day!");
        }
        else {
            System.out.println("What are you talking about?");
        }
    } 
}
