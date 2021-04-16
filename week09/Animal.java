public class Animal {

   protected double mWeight; // accessible to subclasses, but not outsider 
   public Animal() {
       setup();
   } 

   private void setup() {
       mWeight = 0;
   }

   public void eat() {
       System.out.println("I am eating.");
   }

   public void locomote() {
       System.out.println("I am moving.");
   }
}
