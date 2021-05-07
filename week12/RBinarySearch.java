import java.util.Arrays;

public class RBinarySearch {
    
    // Search for the value x in the list L using binary search
    // Input x: the value to search for (int)
    // Input L: an array containing values
    // Returns (int): the index of x in L; -1 if x is not in L
    public static int search(int x, int[] L) {
        int low = 0;
        int high = L.length-1;
        while (low <= high) {
            int mid = (low + high)/2;
            System.out.println(low + " " + mid + " " + high + " " + L[mid]);
            
            if (x > L[mid]) {
                low = mid+1;
            }
            else if (x < L[mid]) {
                high = mid-1;
            }
            else {
                return mid;
            }
        }
        System.out.println(low + " " + high);
        
        return -1;
    }

    // Function overload (same name but different arguments)
    public static int rsearch(int x, int[] L) { // soln without copying
        return rsearch(x, L, 0, L.length-1);
    }

    public static int rsearch(int x, int[] L, int low, int high) { // soln without copying

        if (high < low) return -1;

        int mid = (low + high)/2;
        System.out.println(mid + " " + L[mid]);
            
        if (x > L[mid]) { // look right
            return rsearch(x, L, mid+1, high);
        }
        else if (x < L[mid]) { // look left
            return rsearch(x, L, 0, mid-1);
        }
        else {
            return mid;
        }
    }
    
    public static int rsearchCopy(int x, int[] L) { // soln with copying (inefficient!)

        if (L.length == 0) return -1;

        int mid = (L.length-1)/2;
        System.out.println(mid + " " + L[mid]);
            
        if (x > L[mid]) { // look right
            return 1 + mid + rsearch(x, Arrays.copyOfRange(L, mid+1, L.length));
        }
        else if (x < L[mid]) { // look left
            return rsearch(x, Arrays.copyOfRange(L, 0, mid));
        }
        else {
            return mid;
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = {-20, -4, 44, 58, 99, 145};
        int val = 99;
        int index = rsearch(99, numbers);
        if (index != -1) {
            System.out.println("We found "+val+" at location "+index); 
        }
        else {
            System.out.println("We didn't find " + val); 
        }
        
        index = rsearch(30, numbers);
        System.out.println("Search 30: " + index);
    }
}