public class Contains {
   
    // Implement a function which returns T/F depending on whether an
    // item is in an array
    public static boolean contains(int val, int[] list) {
        boolean flag = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == val) {
                flag = true;
            }
        }
        return flag;
    }

    // Implement a function which returns the first index 
    // containing `val` or -1 if val is not in the list `vals`
    public static int indexOf(int val, int[] vals) {
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] values = {9, -2, 67, -2};
        boolean result = contains(-2, values); // should return true
        System.out.println("Contains -2? "+result);

        result = contains(100, values); // should return false
        System.out.println("Contains 100? "+result);

        int index = indexOf(-2, values); // should return 1 
        System.out.println("Index of -2? "+index);

        index = indexOf(100, values); // should return -1
        System.out.println("index of 100? "+index);
    }
}
