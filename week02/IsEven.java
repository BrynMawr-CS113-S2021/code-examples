public class IsEven {
   public static void main(String[] args) {
       System.out.print("Enter an integer: ");
       String valStr = System.console().readLine();
       int val = Integer.parseInt(valStr);

       // todo: write an if statement to test whether val is even
       // recall: val % 2 == 0 then val is even

       if (val % 2 == 0) {
           System.out.println(v+" is even.");
       }
       else {
           System.out.println(v+" is odd.");
       }
   } 
}
