import java.util.ArrayList;

public class InputPositives {
    public static void main(String[] args) {

        ArrayList<Integer> vals = new ArrayList<Integer>();

        boolean done = false;
        while (!done) {
            String valStr = System.console().readLine();
            int val = Integer.parseInt(valStr);
            if (val < 0) {
                done = true;
            }
            else {
                vals.add(val);
            }
        }

        int sum = 0;
        for (int i = 0; i < vals.size(); i++) {
            sum += vals.get(i);
        }
        System.out.printf("You entered %d values\n", vals.size());
        System.out.printf("Sum: %d\n", sum);
    } 
}
