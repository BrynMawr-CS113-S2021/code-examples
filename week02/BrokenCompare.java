public class BrokenCompare {
   public static void main(String[] args) {
       String word = args[0];
       if (word == "apple") { // this doesn't work in Java!!!
           System.out.println("You said the word of the day!");
       }
       else {
           System.out.println("What are you talking about?");
       }
   } 
}
