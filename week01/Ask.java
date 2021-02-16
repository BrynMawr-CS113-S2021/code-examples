public class Ask {
   public static void main(String[] args) {
       System.out.print("What is your name? ");
       String name = System.console().readLine();
       System.out.println("Hi, "+name+". How are you?");
   } 
}
