class HeightElseIfOrder {
    public static void main(String[] args) {
        System.out.print("Enter a height (inches): ");
        int h = Integer.parseInt(System.console().readLine());
    
        // The first condition executes 
        // What happens when the user inputs h = 72
        if (h > 48) {
          System.out.println("Taller than 4 ft");
        }
        else if (h > 60) {
          System.out.println("Taller than 5 ft");
        }
        else if (h > 36) {
          System.out.println("Taller than 3 ft");
        }
        else {
          System.out.println("Too small for this ride");
        }
    }
}