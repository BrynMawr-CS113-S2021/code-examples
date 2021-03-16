public class Contains {
    
    public static boolean contains(String phrase, char c) {
        boolean flag = false; // flag is a type of boolean variable 
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == c) {
                flag = true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        boolean result = contains("lolcats", 'a');
        System.out.println(result);

        result = contains("lolcats", 'x');
        System.out.println(result);
    }    
}
