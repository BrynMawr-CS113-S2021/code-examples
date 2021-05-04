import java.util.Arrays;

public class PrintList {

    public static void printCopy(int[] L) { 

        if (L.length == 0) {
            return;
        }

        System.out.println(L[0]);
        printCopy(Arrays.copyOfRange(L, 1, L.length)); // creates copy of list
    }

    public static void print(int[] L, int i) { 

        if (i >= L.length) {
            return;
        }

        System.out.println(L[i]);
        print(L, i+1); // does not create a copy of list
    }

    public static void main(String[] args) {

        int[] L = {2,4,6,8};
        print(L, 0);

    } 
}
