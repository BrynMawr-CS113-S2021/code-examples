public class Utilities {
    
    // Function: IsInteger
    // IsInteger tests the string to see if it is a valid integer
    // Returns: true if the given string represents a valid integer; false otherwise
    // Inputs (String) value, the string to test
    public static boolean IsInteger(String value) {

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            int intC = c - '0';
            //System.out.println(c+" "+intC + " " + i); // for debugging
            
            boolean dashIsFirst = (c == '-' && i == 0 && value.length() != 1);
            boolean isDigit = (intC >= 0 && intC <= 9);
            if (!isDigit && !dashIsFirst) {
                return false;
            }
        }

        if (value.length() == 0) {
            return false;
        }

        return true;
    } 

    public static void main(String[] args) {
        String[] testInputs = {"234", "-3", "apple", "", "765.9", "87664 afae", "-"};
        for (int i = 0; i < testInputs.length; i++) {
            boolean result = IsInteger(testInputs[i]);
            System.out.println(testInputs[i]+" is integer? "+result);
        }
    } 
}
