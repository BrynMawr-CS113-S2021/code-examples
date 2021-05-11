import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(-7);
        list.add(3);

        for (int i = 0; i < list.size(); i++) {
            int val = list.get(i); 
            System.out.printf("%d) %d\n", i, val);
        }

        list.remove(1);

        for (int i = 0; i < list.size(); i++) {
            int val = list.get(i); 
            System.out.printf("%d) %d\n", i, val);
        }

        boolean test = list.contains(23);
        System.out.println(test);


    } 
}
