public class Greeting {
    public static void main(String[] args) {
        String greeting = "aloha";

        char c = greeting.charAt(1); // c = 'e'
        System.out.println(c);

        int length = greeting.length();
        // print first character
        System.out.println("First: " + greeting.charAt(0));

        // print last character
        int lastIndex = greeting.length() - 1;
        char lastChar = greeting.charAt(lastIndex);
        System.out.println("Last: " + lastChar);

        // print middle character
        int middle = (int) (greeting.length() * 0.5);
        System.out.println("Middle: "+middle +" "+ greeting.charAt(middle));
    }    
}
