public class CheckWordFixed {
   public static void main(String[] args) {
      String word = args[0]; // 1st command line argument

      if (word.compareTo("apple") == 0) {  // checks if word is equal "apple"
          System.out.print("You entered the word of the day!");
      }
   } 
}
