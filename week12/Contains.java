public class Contains {
   
    public static boolean contains(char x, String phrase) {
        if (phrase.length() == 0) {
            return false;
        }

        if (phrase.charAt(0) == x) {
            return true;
        }

        return contains(x, phrase.substring(1)); //"pple"
    }
    
    public static void main(String[] args) {
        boolean result = contains('a', "apple");
        System.out.println(result);
        System.out.println(contains('z', "apple"));
        System.out.println(contains('l', "apple"));
        System.out.println(contains('e', "apple"));
        System.out.println(contains('e', ""));
    }
}
