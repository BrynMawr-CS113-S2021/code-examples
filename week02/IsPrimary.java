public class IsPrimary {
    public static void main(String[] args) {
        System.out.print("Enter a color: ");
        String color = System.console().readLine();

        if (color.compareTo("red") == 0 || color.compareTo("green") == 0 || color.compareTo("blue") == 0) {
            System.out.println(color+" is primary");
        } 
        else {
            System.out.println(color+" is not primary");
        }
    }
}
