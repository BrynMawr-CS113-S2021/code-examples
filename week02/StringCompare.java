public class StringCompare {
   public static void main(String[] args) {
       String first = "b";
       String second = "b";

       if (first.compareTo(second) == 0) { // checks if first equals second
           System.out.println(first+" is equal to "+second);
       }
       else if (first.compareTo(second) < 0) { // checks if first < second
           System.out.println(first+" is less than "+second);
       }
       else if (first.compareTo(second) > 0) { // checks if first > second
           System.out.println(first+" is greater than "+second);
       }
   } 
}
