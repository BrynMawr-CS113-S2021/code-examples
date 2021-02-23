public class Tip {
   public static void main(String[] args) {
       System.out.print("Enter the meal price: ");
       double price = Double.parseDouble(System.console().readLine());

       System.out.print("Enter the tip amount: ");
       double percent = Double.parseDouble(System.console().readLine());

       double tip = percent * price;
       System.out.println("The tip is "+tip);
   }

}
