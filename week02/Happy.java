public class Happy {
   public static void main(String[] args) {
       boolean isHappy = false;
       boolean knowIt = false;
       if (!(isHappy && knowIt)) { 
           // We only execute the code inside the curly braces
           // if isHappy && knowIt evaluates to true
           System.out.println("Clap your hands!");
       }
       else {
           // the statements inside this curly brace block
           // only execute when isHappy && knowIt is false
           System.out.println("Sit quietly.");
       }
   } 
}
